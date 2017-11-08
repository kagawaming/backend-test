package com.ge.project.rest.db.SQL;

import com.ge.project.rest.db.AbcDao;
import nam.e.spa.ce.Abc;
import java.util.HashMap;
import java.util.Map;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

/**
 * Created by i858764 on 8/27/17.
 */
public class AbcDaoImpl implements AbcDao {


    private Map<String, Abc> _database;
    private DataSource _dataSource;

    private final static String TABLE_NAME = "shao_shan_chong";
    private final static String LONG_URL = "long_url";
    private final static String SHORT_URL = "short_url";

    public AbcDaoImpl(DataSource dataSource) {
        _dataSource = dataSource;
        _database = new HashMap<>();
    }

    @Override
    public Abc get(String longUrl) {
        return _database.get(longUrl);
    }

    @Override
    public Integer insert(Abc abc) {
        String sql = "INSERT INTO " + TABLE_NAME + " (long_url, short_url) VALUES(:long_url, :short_url)";
        SqlParameterSource params = new MapSqlParameterSource()
                .addValue(LONG_URL, abc.getLongUrl())
                .addValue(SHORT_URL, abc.getShortUrl());
        return new NamedParameterJdbcTemplate(_dataSource).update(sql, params);
        //_database.put(abc.getLongUrl(), abc);
    }

    @Override
    public void update(String longUrl, Abc abc) {
        _database.put(longUrl, abc);
    }

    @Override
    public void delete(String longUrl) {
        _database.remove(longUrl);
    }

}

