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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteDomainBatchDetail extends AbstractModel {

    /**
    * The domain ID.
    */
    @SerializedName("DomainId")
    @Expose
    private Long DomainId;

    /**
    * The domain name.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * The error message.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Error")
    @Expose
    private String Error;

    /**
    * The domain deletion status.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * The operation.
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
     * Get The domain ID. 
     * @return DomainId The domain ID.
     */
    public Long getDomainId() {
        return this.DomainId;
    }

    /**
     * Set The domain ID.
     * @param DomainId The domain ID.
     */
    public void setDomainId(Long DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get The domain name. 
     * @return Domain The domain name.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set The domain name.
     * @param Domain The domain name.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get The error message.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Error The error message.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getError() {
        return this.Error;
    }

    /**
     * Set The error message.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Error The error message.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setError(String Error) {
        this.Error = Error;
    }

    /**
     * Get The domain deletion status. 
     * @return Status The domain deletion status.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set The domain deletion status.
     * @param Status The domain deletion status.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get The operation. 
     * @return Operation The operation.
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set The operation.
     * @param Operation The operation.
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    public DeleteDomainBatchDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteDomainBatchDetail(DeleteDomainBatchDetail source) {
        if (source.DomainId != null) {
            this.DomainId = new Long(source.DomainId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Error != null) {
            this.Error = new String(source.Error);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Error", this.Error);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Operation", this.Operation);

    }
}

