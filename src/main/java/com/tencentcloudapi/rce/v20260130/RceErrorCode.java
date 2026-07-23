package com.tencentcloudapi.rce.v20260130;
public enum RceErrorCode {
     /* System exception. */
     INTERNALERROR_SYSTEMEXCEPTION("InternalError.SystemException"),
     
     /* Invalid parameter. */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* Invalid field format. */
     INVALIDPARAMETER_INVALIDFORMAT("InvalidParameter.InvalidFormat"),
     
     /* Invalid field value. */
     INVALIDPARAMETER_INVALIDVALUE("InvalidParameter.InvalidValue"),
     
     /* Field length exceeds the maximum limit. */
     INVALIDPARAMETER_LENGTHEXCEED("InvalidParameter.LengthExceed"),
     
     /* Event not exist. */
     INVALIDPARAMETERVALUE_EVENTNOTEXIST("InvalidParameterValue.EventNotExist"),
     
     /* Tenant not exist. */
     INVALIDPARAMETERVALUE_TENANTNOTEXIST("InvalidParameterValue.TenantNotExist"),
     
     /* Missing parameter. */
     MISSINGPARAMETER("MissingParameter"),
     
     /* Missing required field. */
     MISSINGPARAMETER_FIELDMISSED("MissingParameter.FieldMissed"),
     
     /* Unauthorized operation. */
     UNAUTHORIZEDOPERATION("UnauthorizedOperation");
     
    private String value;
    private RceErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

