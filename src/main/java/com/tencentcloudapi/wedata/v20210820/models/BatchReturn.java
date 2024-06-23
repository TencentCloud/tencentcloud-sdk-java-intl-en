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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchReturn extends AbstractModel {

    /**
    * Execution Result
    */
    @SerializedName("Result")
    @Expose
    private Boolean Result;

    /**
    * Execution remarks
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ErrorDesc")
    @Expose
    private String ErrorDesc;

    /**
    * Execution ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ErrorId")
    @Expose
    private String ErrorId;

    /**
     * Get Execution Result 
     * @return Result Execution Result
     */
    public Boolean getResult() {
        return this.Result;
    }

    /**
     * Set Execution Result
     * @param Result Execution Result
     */
    public void setResult(Boolean Result) {
        this.Result = Result;
    }

    /**
     * Get Execution remarks
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ErrorDesc Execution remarks
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getErrorDesc() {
        return this.ErrorDesc;
    }

    /**
     * Set Execution remarks
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ErrorDesc Execution remarks
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setErrorDesc(String ErrorDesc) {
        this.ErrorDesc = ErrorDesc;
    }

    /**
     * Get Execution ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ErrorId Execution ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getErrorId() {
        return this.ErrorId;
    }

    /**
     * Set Execution ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ErrorId Execution ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setErrorId(String ErrorId) {
        this.ErrorId = ErrorId;
    }

    public BatchReturn() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchReturn(BatchReturn source) {
        if (source.Result != null) {
            this.Result = new Boolean(source.Result);
        }
        if (source.ErrorDesc != null) {
            this.ErrorDesc = new String(source.ErrorDesc);
        }
        if (source.ErrorId != null) {
            this.ErrorId = new String(source.ErrorId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "ErrorDesc", this.ErrorDesc);
        this.setParamSimple(map, prefix + "ErrorId", this.ErrorId);

    }
}

