package model.views;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.RowIterator;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat May 04 06:11:23 PDT 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class Employees1VORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        EmployeeId {
            public Object get(Employees1VORowImpl obj) {
                return obj.getEmployeeId();
            }

            public void put(Employees1VORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        FirstName {
            public Object get(Employees1VORowImpl obj) {
                return obj.getFirstName();
            }

            public void put(Employees1VORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        LastName {
            public Object get(Employees1VORowImpl obj) {
                return obj.getLastName();
            }

            public void put(Employees1VORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        Email {
            public Object get(Employees1VORowImpl obj) {
                return obj.getEmail();
            }

            public void put(Employees1VORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        PhoneNumber {
            public Object get(Employees1VORowImpl obj) {
                return obj.getPhoneNumber();
            }

            public void put(Employees1VORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        HireDate {
            public Object get(Employees1VORowImpl obj) {
                return obj.getHireDate();
            }

            public void put(Employees1VORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        JobId {
            public Object get(Employees1VORowImpl obj) {
                return obj.getJobId();
            }

            public void put(Employees1VORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        Salary {
            public Object get(Employees1VORowImpl obj) {
                return obj.getSalary();
            }

            public void put(Employees1VORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        CommissionPct {
            public Object get(Employees1VORowImpl obj) {
                return obj.getCommissionPct();
            }

            public void put(Employees1VORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ManagerId {
            public Object get(Employees1VORowImpl obj) {
                return obj.getManagerId();
            }

            public void put(Employees1VORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        DepartmentId {
            public Object get(Employees1VORowImpl obj) {
                return obj.getDepartmentId();
            }

            public void put(Employees1VORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ManagerIdEmployees1VO {
            public Object get(Employees1VORowImpl obj) {
                return obj.getManagerIdEmployees1VO();
            }

            public void put(Employees1VORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(Employees1VORowImpl object);

        public abstract void put(Employees1VORowImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int EMPLOYEEID = AttributesEnum.EmployeeId.index();
    public static final int FIRSTNAME = AttributesEnum.FirstName.index();
    public static final int LASTNAME = AttributesEnum.LastName.index();
    public static final int EMAIL = AttributesEnum.Email.index();
    public static final int PHONENUMBER = AttributesEnum.PhoneNumber.index();
    public static final int HIREDATE = AttributesEnum.HireDate.index();
    public static final int JOBID = AttributesEnum.JobId.index();
    public static final int SALARY = AttributesEnum.Salary.index();
    public static final int COMMISSIONPCT = AttributesEnum.CommissionPct.index();
    public static final int MANAGERID = AttributesEnum.ManagerId.index();
    public static final int DEPARTMENTID = AttributesEnum.DepartmentId.index();
    public static final int MANAGERIDEMPLOYEES1VO = AttributesEnum.ManagerIdEmployees1VO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public Employees1VORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute EmployeeId.
     * @return the EmployeeId
     */
    public Integer getEmployeeId() {
        return (Integer) getAttributeInternal(EMPLOYEEID);
    }

    /**
     * Gets the attribute value for the calculated attribute FirstName.
     * @return the FirstName
     */
    public String getFirstName() {
        return (String) getAttributeInternal(FIRSTNAME);
    }

    /**
     * Gets the attribute value for the calculated attribute LastName.
     * @return the LastName
     */
    public String getLastName() {
        return (String) getAttributeInternal(LASTNAME);
    }

    /**
     * Gets the attribute value for the calculated attribute Email.
     * @return the Email
     */
    public String getEmail() {
        return (String) getAttributeInternal(EMAIL);
    }

    /**
     * Gets the attribute value for the calculated attribute PhoneNumber.
     * @return the PhoneNumber
     */
    public String getPhoneNumber() {
        return (String) getAttributeInternal(PHONENUMBER);
    }

    /**
     * Gets the attribute value for the calculated attribute HireDate.
     * @return the HireDate
     */
    public Timestamp getHireDate() {
        return (Timestamp) getAttributeInternal(HIREDATE);
    }

    /**
     * Gets the attribute value for the calculated attribute JobId.
     * @return the JobId
     */
    public String getJobId() {
        return (String) getAttributeInternal(JOBID);
    }

    /**
     * Gets the attribute value for the calculated attribute Salary.
     * @return the Salary
     */
    public BigDecimal getSalary() {
        return (BigDecimal) getAttributeInternal(SALARY);
    }

    /**
     * Gets the attribute value for the calculated attribute CommissionPct.
     * @return the CommissionPct
     */
    public BigDecimal getCommissionPct() {
        return (BigDecimal) getAttributeInternal(COMMISSIONPCT);
    }

    /**
     * Gets the attribute value for the calculated attribute ManagerId.
     * @return the ManagerId
     */
    public Integer getManagerId() {
        return (Integer) getAttributeInternal(MANAGERID);
    }

    /**
     * Gets the attribute value for the calculated attribute DepartmentId.
     * @return the DepartmentId
     */
    public Integer getDepartmentId() {
        return (Integer) getAttributeInternal(DEPARTMENTID);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link ManagerIdEmployees1VO.
     */
    public RowIterator getManagerIdEmployees1VO() {
        return (RowIterator) getAttributeInternal(MANAGERIDEMPLOYEES1VO);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index, AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value, AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }
}

