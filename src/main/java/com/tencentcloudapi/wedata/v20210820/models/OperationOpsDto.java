/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OperationOpsDto extends AbstractModel {

    /**
    * Operation Success
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Result")
    @Expose
    private Boolean Result;

    /**
    * Operation Result Details
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ResultMsg")
    @Expose
    private String ResultMsg;

    /**
    * Operation Failure Type
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ErrorId")
    @Expose
    private String ErrorId;

    /**
    * Operation Failure Description
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ErrorDesc")
    @Expose
    private String ErrorDesc;

    /**
     * Get Operation Success
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Result Operation Success
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Boolean getResult() {
        return this.Result;
    }

    /**
     * Set Operation Success
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Result Operation Success
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setResult(Boolean Result) {
        this.Result = Result;
    }

    /**
     * Get Operation Result Details
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ResultMsg Operation Result Details
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getResultMsg() {
        return this.ResultMsg;
    }

    /**
     * Set Operation Result Details
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ResultMsg Operation Result Details
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setResultMsg(String ResultMsg) {
        this.ResultMsg = ResultMsg;
    }

    /**
     * Get Operation Failure Type
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ErrorId Operation Failure Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getErrorId() {
        return this.ErrorId;
    }

    /**
     * Set Operation Failure Type
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ErrorId Operation Failure Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setErrorId(String ErrorId) {
        this.ErrorId = ErrorId;
    }

    /**
     * Get Operation Failure Description
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ErrorDesc Operation Failure Description
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getErrorDesc() {
        return this.ErrorDesc;
    }

    /**
     * Set Operation Failure Description
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ErrorDesc Operation Failure Description
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setErrorDesc(String ErrorDesc) {
        this.ErrorDesc = ErrorDesc;
    }

    public OperationOpsDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OperationOpsDto(OperationOpsDto source) {
        if (source.Result != null) {
            this.Result = new Boolean(source.Result);
        }
        if (source.ResultMsg != null) {
            this.ResultMsg = new String(source.ResultMsg);
        }
        if (source.ErrorId != null) {
            this.ErrorId = new String(source.ErrorId);
        }
        if (source.ErrorDesc != null) {
            this.ErrorDesc = new String(source.ErrorDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "ResultMsg", this.ResultMsg);
        this.setParamSimple(map, prefix + "ErrorId", this.ErrorId);
        this.setParamSimple(map, prefix + "ErrorDesc", this.ErrorDesc);

    }
}

