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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiskReturnable extends AbstractModel {

    /**
    * Cloud disk ID.
    */
    @SerializedName("DiskId")
    @Expose
    private String DiskId;

    /**
    * Whether the cloud disk can be returned.
    */
    @SerializedName("IsReturnable")
    @Expose
    private Boolean IsReturnable;

    /**
    * Error code of cloud disk return failure.
    */
    @SerializedName("ReturnFailCode")
    @Expose
    private Long ReturnFailCode;

    /**
    * Error message of cloud disk return failure.
    */
    @SerializedName("ReturnFailMessage")
    @Expose
    private String ReturnFailMessage;

    /**
     * Get Cloud disk ID. 
     * @return DiskId Cloud disk ID.
     */
    public String getDiskId() {
        return this.DiskId;
    }

    /**
     * Set Cloud disk ID.
     * @param DiskId Cloud disk ID.
     */
    public void setDiskId(String DiskId) {
        this.DiskId = DiskId;
    }

    /**
     * Get Whether the cloud disk can be returned. 
     * @return IsReturnable Whether the cloud disk can be returned.
     */
    public Boolean getIsReturnable() {
        return this.IsReturnable;
    }

    /**
     * Set Whether the cloud disk can be returned.
     * @param IsReturnable Whether the cloud disk can be returned.
     */
    public void setIsReturnable(Boolean IsReturnable) {
        this.IsReturnable = IsReturnable;
    }

    /**
     * Get Error code of cloud disk return failure. 
     * @return ReturnFailCode Error code of cloud disk return failure.
     */
    public Long getReturnFailCode() {
        return this.ReturnFailCode;
    }

    /**
     * Set Error code of cloud disk return failure.
     * @param ReturnFailCode Error code of cloud disk return failure.
     */
    public void setReturnFailCode(Long ReturnFailCode) {
        this.ReturnFailCode = ReturnFailCode;
    }

    /**
     * Get Error message of cloud disk return failure. 
     * @return ReturnFailMessage Error message of cloud disk return failure.
     */
    public String getReturnFailMessage() {
        return this.ReturnFailMessage;
    }

    /**
     * Set Error message of cloud disk return failure.
     * @param ReturnFailMessage Error message of cloud disk return failure.
     */
    public void setReturnFailMessage(String ReturnFailMessage) {
        this.ReturnFailMessage = ReturnFailMessage;
    }

    public DiskReturnable() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiskReturnable(DiskReturnable source) {
        if (source.DiskId != null) {
            this.DiskId = new String(source.DiskId);
        }
        if (source.IsReturnable != null) {
            this.IsReturnable = new Boolean(source.IsReturnable);
        }
        if (source.ReturnFailCode != null) {
            this.ReturnFailCode = new Long(source.ReturnFailCode);
        }
        if (source.ReturnFailMessage != null) {
            this.ReturnFailMessage = new String(source.ReturnFailMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskId", this.DiskId);
        this.setParamSimple(map, prefix + "IsReturnable", this.IsReturnable);
        this.setParamSimple(map, prefix + "ReturnFailCode", this.ReturnFailCode);
        this.setParamSimple(map, prefix + "ReturnFailMessage", this.ReturnFailMessage);

    }
}

