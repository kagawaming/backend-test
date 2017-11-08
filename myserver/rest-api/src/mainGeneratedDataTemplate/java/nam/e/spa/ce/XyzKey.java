
package nam.e.spa.ce;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;


/**
 * Be nice to write something!
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from /Users/mqiu/Desktop/sysD/myserverbackend_trunk/myserver/rest-api/src/main/pegasus/nam/e/spa/ce/XyzKey.pdsc.", date = "Sun Aug 27 17:35:59 PDT 2017")
public class XyzKey
    extends RecordTemplate
{

    private final static XyzKey.Fields _fields = new XyzKey.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("{\"type\":\"record\",\"name\":\"XyzKey\",\"namespace\":\"nam.e.spa.ce\",\"doc\":\"Be nice to write something!\",\"fields\":[{\"name\":\"num1\",\"type\":\"int\",\"doc\":\"Be nice to write something!\"},{\"name\":\"num2\",\"type\":\"int\",\"doc\":\"Be nice to write something!\"}]}"));
    private final static RecordDataSchema.Field FIELD_Num1 = SCHEMA.getField("num1");
    private final static RecordDataSchema.Field FIELD_Num2 = SCHEMA.getField("num2");

    public XyzKey() {
        super(new DataMap(), SCHEMA);
    }

    public XyzKey(DataMap data) {
        super(data, SCHEMA);
    }

    public static XyzKey.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for num1
     * 
     * @see XyzKey.Fields#num1
     */
    public boolean hasNum1() {
        return contains(FIELD_Num1);
    }

    /**
     * Remover for num1
     * 
     * @see XyzKey.Fields#num1
     */
    public void removeNum1() {
        remove(FIELD_Num1);
    }

    /**
     * Getter for num1
     * 
     * @see XyzKey.Fields#num1
     */
    public Integer getNum1(GetMode mode) {
        return obtainDirect(FIELD_Num1, Integer.class, mode);
    }

    /**
     * Getter for num1
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see XyzKey.Fields#num1
     */
    @Nonnull
    public Integer getNum1() {
        return obtainDirect(FIELD_Num1, Integer.class, GetMode.STRICT);
    }

    /**
     * Setter for num1
     * 
     * @see XyzKey.Fields#num1
     */
    public XyzKey setNum1(Integer value, SetMode mode) {
        putDirect(FIELD_Num1, Integer.class, Integer.class, value, mode);
        return this;
    }

    /**
     * Setter for num1
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see XyzKey.Fields#num1
     */
    public XyzKey setNum1(
        @Nonnull
        Integer value) {
        putDirect(FIELD_Num1, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for num1
     * 
     * @see XyzKey.Fields#num1
     */
    public XyzKey setNum1(int value) {
        putDirect(FIELD_Num1, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for num2
     * 
     * @see XyzKey.Fields#num2
     */
    public boolean hasNum2() {
        return contains(FIELD_Num2);
    }

    /**
     * Remover for num2
     * 
     * @see XyzKey.Fields#num2
     */
    public void removeNum2() {
        remove(FIELD_Num2);
    }

    /**
     * Getter for num2
     * 
     * @see XyzKey.Fields#num2
     */
    public Integer getNum2(GetMode mode) {
        return obtainDirect(FIELD_Num2, Integer.class, mode);
    }

    /**
     * Getter for num2
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see XyzKey.Fields#num2
     */
    @Nonnull
    public Integer getNum2() {
        return obtainDirect(FIELD_Num2, Integer.class, GetMode.STRICT);
    }

    /**
     * Setter for num2
     * 
     * @see XyzKey.Fields#num2
     */
    public XyzKey setNum2(Integer value, SetMode mode) {
        putDirect(FIELD_Num2, Integer.class, Integer.class, value, mode);
        return this;
    }

    /**
     * Setter for num2
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see XyzKey.Fields#num2
     */
    public XyzKey setNum2(
        @Nonnull
        Integer value) {
        putDirect(FIELD_Num2, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for num2
     * 
     * @see XyzKey.Fields#num2
     */
    public XyzKey setNum2(int value) {
        putDirect(FIELD_Num2, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public XyzKey clone()
        throws CloneNotSupportedException
    {
        return ((XyzKey) super.clone());
    }

    @Override
    public XyzKey copy()
        throws CloneNotSupportedException
    {
        return ((XyzKey) super.copy());
    }

    public static class Fields
        extends PathSpec
    {


        public Fields(List<String> path, String name) {
            super(path, name);
        }

        public Fields() {
            super();
        }

        /**
         * Be nice to write something!
         * 
         */
        public PathSpec num1() {
            return new PathSpec(getPathComponents(), "num1");
        }

        /**
         * Be nice to write something!
         * 
         */
        public PathSpec num2() {
            return new PathSpec(getPathComponents(), "num2");
        }

    }

}
