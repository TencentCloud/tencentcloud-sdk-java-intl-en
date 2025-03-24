package com.tencentcloudapi.cdwdoris.v20211228;
public enum CdwdorisErrorCode {
     /* Internal error. */
     INTERNALERROR("InternalError");
     
    private String value;
    private CdwdorisErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

