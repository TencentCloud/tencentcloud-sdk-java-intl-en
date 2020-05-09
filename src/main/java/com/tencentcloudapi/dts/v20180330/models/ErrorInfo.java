/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.dts.v20180330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ErrorInfo extends AbstractModel{

    /**
    * Specific error log, including error code and error message
    */
    @SerializedName("ErrorLog")
    @Expose
    private String ErrorLog;

    /**
    * Help document URL corresponding to error
    */
    @SerializedName("HelpDoc")
    @Expose
    private String HelpDoc;

    /**
     * Get Specific error log, including error code and error message 
     * @return ErrorLog Specific error log, including error code and error message
     */
    public String getErrorLog() {
        return this.ErrorLog;
    }

    /**
     * Set Specific error log, including error code and error message
     * @param ErrorLog Specific error log, including error code and error message
     */
    public void setErrorLog(String ErrorLog) {
        this.ErrorLog = ErrorLog;
    }

    /**
     * Get Help document URL corresponding to error 
     * @return HelpDoc Help document URL corresponding to error
     */
    public String getHelpDoc() {
        return this.HelpDoc;
    }

    /**
     * Set Help document URL corresponding to error
     * @param HelpDoc Help document URL corresponding to error
     */
    public void setHelpDoc(String HelpDoc) {
        this.HelpDoc = HelpDoc;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ErrorLog", this.ErrorLog);
        this.setParamSimple(map, prefix + "HelpDoc", this.HelpDoc);

    }
}

