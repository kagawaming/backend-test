
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
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from /Users/mqiu/Desktop/sysD/myserverbackend_trunk/myserver/rest-api/src/main/pegasus/nam/e/spa/ce/Xyz.pdsc.", date = "Sun Aug 27 17:35:59 PDT 2017")
public class Xyz
    extends RecordTemplate
{

    private final static Xyz.Fields _fields = new Xyz.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("{\"type\":\"record\",\"name\":\"Xyz\",\"namespace\":\"nam.e.spa.ce\",\"doc\":\"Be nice to write something!\",\"fields\":[{\"name\":\"num1\",\"type\":\"int\",\"doc\":\"Be nice to write something!\"},{\"name\":\"num2\",\"type\":\"int\",\"doc\":\"Be nice to write something!\"},{\"name\":\"sum\",\"type\":\"int\",\"doc\":\"Be nice to write something!\"}]}"));
    private final static RecordDataSchema.Field FIELD_Num1 = SCHEMA.getField("num1");
    private final static RecordDataSchema.Field FIELD_Num2 = SCHEMA.getField("num2");
    private final static RecordDataSchema.Field FIELD_Sum = SCHEMA.getField("sum");

    public Xyz() {
        super(new DataMap(), SCHEMA);
    }

    public Xyz(DataMap data) {
        super(data, SCHEMA);
    }

    public static Xyz.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for num1
     * 
     * @see Xyz.Fields#num1
     */
    public boolean hasNum1() {
        return contains(FIELD_Num1);
    }

    /**
     * Remover for num1
     * 
     * @see Xyz.Fields#num1
     */
    public void removeNum1() {
        remove(FIELD_Num1);
    }

    /**
     * Getter for num1
     * 
     * @see Xyz.Fields#num1
     */
    public Integer getNum1(GetMode mode) {
        return obtainDirect(FIELD_Num1, Integer.class, mode);
    }

    /**
     * Getter for num1
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Xyz.Fields#num1
     */
    @Nonnull
    public Integer getNum1() {
        return obtainDirect(FIELD_Num1, Integer.class, GetMode.STRICT);
    }

    /**
     * Setter for num1
     * 
     * @see Xyz.Fields#num1
     */
    public Xyz setNum1(Integer value, SetMode mode) {
        putDirect(FIELD_Num1, Integer.class, Integer.class, value, mode);
        return this;
    }

    /**
     * Setter for num1
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Xyz.Fields#num1
     */
    public Xyz setNum1(
        @Nonnull
        Integer value) {
        putDirect(FIELD_Num1, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for num1
     * 
     * @see Xyz.Fields#num1
     */
    public Xyz setNum1(int value) {
        putDirect(FIELD_Num1, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for num2
     * 
     * @see Xyz.Fields#num2
     */
    public boolean hasNum2() {
        return contains(FIELD_Num2);
    }

    /**
     * Remover for num2
     * 
     * @see Xyz.Fields#num2
     */
    public void removeNum2() {
        remove(FIELD_Num2);
    }

    /**
     * Getter for num2
     * 
     * @see Xyz.Fields#num2
     */
    public Integer getNum2(GetMode mode) {
        return obtainDirect(FIELD_Num2, Integer.class, mode);
    }

    /**
     * Getter for num2
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Xyz.Fields#num2
     */
    @Nonnull
    public Integer getNum2() {
        return obtainDirect(FIELD_Num2, Integer.class, GetMode.STRICT);
    }

    /**
     * Setter for num2
     * 
     * @see Xyz.Fields#num2
     */
    public Xyz setNum2(Integer value, SetMode mode) {
        putDirect(FIELD_Num2, Integer.class, Integer.class, value, mode);
        return this;
    }

    /**
     * Setter for num2
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Xyz.Fields#num2
     */
    public Xyz setNum2(
        @Nonnull
        Integer value) {
        putDirect(FIELD_Num2, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for num2
     * 
     * @see Xyz.Fields#num2
     */
    public Xyz setNum2(int value) {
        putDirect(FIELD_Num2, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for sum
     * 
     * @see Xyz.Fields#sum
     */
    public boolean hasSum() {
        return contains(FIELD_Sum);
    }

    /**
     * Remover for sum
     * 
     * @see Xyz.Fields#sum
     */
    public void removeSum() {
        remove(FIELD_Sum);
    }

    /**
     * Getter for sum
     * 
     * @see Xyz.Fields#sum
     */
    public Integer getSum(GetMode mode) {
        return obtainDirect(FIELD_Sum, Integer.class, mode);
    }

    /**
     * Getter for sum
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Xyz.Fields#sum
     */
    @Nonnull
    public Integer getSum() {
        return obtainDirect(FIELD_Sum, Integer.class, GetMode.STRICT);
    }

    /**
     * Setter for sum
     * 
     * @see Xyz.Fields#sum
     */
    public Xyz setSum(Integer value, SetMode mode) {
        putDirect(FIELD_Sum, Integer.class, Integer.class, value, mode);
        return this;
    }

    /**
     * Setter for sum
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Xyz.Fields#sum
     */
    public Xyz setSum(
        @Nonnull
        Integer value) {
        putDirect(FIELD_Sum, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for sum
     * 
     * @see Xyz.Fields#sum
     */
    public Xyz setSum(int value) {
        putDirect(FIELD_Sum, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public Xyz clone()
        throws CloneNotSupportedException
    {
        return ((Xyz) super.clone());
    }

    @Override
    public Xyz copy()
        throws CloneNotSupportedException
    {
        return ((Xyz) super.copy());
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

        /**
         * Be nice to write something!
         * 
         */
        public PathSpec sum() {
            return new PathSpec(getPathComponents(), "sum");
        }

    }

}
