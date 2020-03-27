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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class JgwOperateResponse extends AbstractModel{

    /**
    * Returned code. 0: normal, other values: error
    */
    @SerializedName("ReturnCode")
    @Expose
    private String ReturnCode;

    /**
    * Success message
    */
    @SerializedName("ReturnMessage")
    @Expose
    private String ReturnMessage;

    /**
    * Data returned by an operation, which may contain `flowId`, etc.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Data")
    @Expose
    private OperateResponseData Data;

    /**
     * Get Returned code. 0: normal, other values: error 
     * @return ReturnCode Returned code. 0: normal, other values: error
     */
    public String getReturnCode() {
        return this.ReturnCode;
    }

    /**
     * Set Returned code. 0: normal, other values: error
     * @param ReturnCode Returned code. 0: normal, other values: error
     */
    public void setReturnCode(String ReturnCode) {
        this.ReturnCode = ReturnCode;
    }

    /**
     * Get Success message 
     * @return ReturnMessage Success message
     */
    public String getReturnMessage() {
        return this.ReturnMessage;
    }

    /**
     * Set Success message
     * @param ReturnMessage Success message
     */
    public void setReturnMessage(String ReturnMessage) {
        this.ReturnMessage = ReturnMessage;
    }

    /**
     * Get Data returned by an operation, which may contain `flowId`, etc.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Data Data returned by an operation, which may contain `flowId`, etc.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public OperateResponseData getData() {
        return this.Data;
    }

    /**
     * Set Data returned by an operation, which may contain `flowId`, etc.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Data Data returned by an operation, which may contain `flowId`, etc.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setData(OperateResponseData Data) {
        this.Data = Data;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReturnCode", this.ReturnCode);
        this.setParamSimple(map, prefix + "ReturnMessage", this.ReturnMessage);
        this.setParamObj(map, prefix + "Data.", this.Data);

    }
}

