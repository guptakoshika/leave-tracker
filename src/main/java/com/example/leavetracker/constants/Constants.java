package com.example.leavetracker.constants;

public class Constants {

    //security constants
    public final static Long EXCEPTION_TIME = 864000000L;
    public static final String HEADER_STRING = "authorization";
    public static final String ADD_EMP_URL = "/api/employee";
    public static final String TOKEN_SECRET = "jf9i4jgu83nflo";

    //generic
    public static final String STATUS_SUCCESS = "Success";
    public static final String STATUS_FAILED = "failed";

    //date
    public static final String DATE_FORMAT = "dd/MM/yyyy";

    //employee api
    public static final String EMP_ADD_SUCCESS = "Employee saved successfully.";
    public static final String EMP_ADD_FAILED = "Error in saving employee.";
    public static final String  EMP_GENDER_FEMALE = "female";
    public static final String EMP_GENDER_MALE = "male";
    public static final String EMP_GENDER_NOT_DEFINED = "not defined";
    public static final String EMP_DELETE_SUCCESS = "Employee deleted successfully.";
    public static final String EMP_ID_MANDATORY = "Employee id cannot be null.";

    //leave api
    public static final String LEAVE_NOT_FOUND = "leave not found.";
    public static final String LEAVE_TYPE_SABBATICAL = "SABATICAL";
    public static final String LEAVE_TYPE_MATERNITY = "maternity";
    public static final String LEAVE_TYPE_PATERNITY = "paternity";
    public static final String LEAVE_APPLY_SUCCESS = "Leave appplied successfully!";
    public static final String LEAVE_APPLY_FAILED = "leave applying failed!";
    public static final String LEAVES_FOR_EMP_ID = "Leaves for Employess are:";

}
