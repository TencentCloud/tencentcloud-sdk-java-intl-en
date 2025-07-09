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

public class BatchOperateResultOpsDto extends AbstractModel {

    /**
    * ResultNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Result")
    @Expose
    private Boolean Result;

    /**
    * Error ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ErrorId")
    @Expose
    private String ErrorId;

    /**
    * Error Description
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ErrorDesc")
    @Expose
    private String ErrorDesc;

    /**
     * Get ResultNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Result ResultNote: This field may return null, indicating that no valid value can be obtained.
     */
    public Boolean getResult() {
        return this.Result;
    }

    /**
     * Set ResultNote: This field may return null, indicating that no valid value can be obtained.
     * @param Result ResultNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setResult(Boolean Result) {
        this.Result = Result;
    }

    /**
     * Get Error ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ErrorId Error ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getErrorId() {
        return this.ErrorId;
    }

    /**
     * Set Error ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ErrorId Error ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setErrorId(String ErrorId) {
        this.ErrorId = ErrorId;
    }

    /**
     * Get Error Description
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ErrorDesc Error Description
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getErrorDesc() {
        return this.ErrorDesc;
    }

    /**
     * Set Error Description
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ErrorDesc Error Description
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setErrorDesc(String ErrorDesc) {
        this.ErrorDesc = ErrorDesc;
    }

    public BatchOperateResultOpsDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchOperateResultOpsDto(BatchOperateResultOpsDto source) {
        if (source.Result != null) {
            this.Result = new Boolean(source.Result);
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
        this.setParamSimple(map, prefix + "ErrorId", this.ErrorId);
        this.setParamSimple(map, prefix + "ErrorDesc", this.ErrorDesc);

    }
}

