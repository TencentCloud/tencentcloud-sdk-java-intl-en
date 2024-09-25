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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyObjectRequest extends AbstractModel {

    /**
    * Modifies the object identifier
    */
    @SerializedName("ObjectId")
    @Expose
    private String ObjectId;

    /**
    * Action type. Status: change enabling status; InstanceId: bind to an instance; Proxy: set the proxy status.
    */
    @SerializedName("OpType")
    @Expose
    private String OpType;

    /**
    * New WAF switch status, considered successful if identical to existing status
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * New instance ID: considered a successful modification if identical to an already bound instance
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Whether to enable proxy. 0: do not enable; 1: use the first IP address in XFF as the client IP address; 2: use remote_addr as the client IP address; 3: obtain the client IP address from the specified header field that is given in IpHeaders. (This value is effective when OpType is set to Status or Proxy.)
    */
    @SerializedName("Proxy")
    @Expose
    private Long Proxy;

    /**
    * This parameter indicates a custom header and is required when IsCdn is set to 3. (The value is effective when OpType is set to Status or Proxy.)
    */
    @SerializedName("IpHeaders")
    @Expose
    private String [] IpHeaders;

    /**
     * Get Modifies the object identifier 
     * @return ObjectId Modifies the object identifier
     */
    public String getObjectId() {
        return this.ObjectId;
    }

    /**
     * Set Modifies the object identifier
     * @param ObjectId Modifies the object identifier
     */
    public void setObjectId(String ObjectId) {
        this.ObjectId = ObjectId;
    }

    /**
     * Get Action type. Status: change enabling status; InstanceId: bind to an instance; Proxy: set the proxy status. 
     * @return OpType Action type. Status: change enabling status; InstanceId: bind to an instance; Proxy: set the proxy status.
     */
    public String getOpType() {
        return this.OpType;
    }

    /**
     * Set Action type. Status: change enabling status; InstanceId: bind to an instance; Proxy: set the proxy status.
     * @param OpType Action type. Status: change enabling status; InstanceId: bind to an instance; Proxy: set the proxy status.
     */
    public void setOpType(String OpType) {
        this.OpType = OpType;
    }

    /**
     * Get New WAF switch status, considered successful if identical to existing status 
     * @return Status New WAF switch status, considered successful if identical to existing status
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set New WAF switch status, considered successful if identical to existing status
     * @param Status New WAF switch status, considered successful if identical to existing status
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get New instance ID: considered a successful modification if identical to an already bound instance 
     * @return InstanceId New instance ID: considered a successful modification if identical to an already bound instance
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set New instance ID: considered a successful modification if identical to an already bound instance
     * @param InstanceId New instance ID: considered a successful modification if identical to an already bound instance
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Whether to enable proxy. 0: do not enable; 1: use the first IP address in XFF as the client IP address; 2: use remote_addr as the client IP address; 3: obtain the client IP address from the specified header field that is given in IpHeaders. (This value is effective when OpType is set to Status or Proxy.) 
     * @return Proxy Whether to enable proxy. 0: do not enable; 1: use the first IP address in XFF as the client IP address; 2: use remote_addr as the client IP address; 3: obtain the client IP address from the specified header field that is given in IpHeaders. (This value is effective when OpType is set to Status or Proxy.)
     */
    public Long getProxy() {
        return this.Proxy;
    }

    /**
     * Set Whether to enable proxy. 0: do not enable; 1: use the first IP address in XFF as the client IP address; 2: use remote_addr as the client IP address; 3: obtain the client IP address from the specified header field that is given in IpHeaders. (This value is effective when OpType is set to Status or Proxy.)
     * @param Proxy Whether to enable proxy. 0: do not enable; 1: use the first IP address in XFF as the client IP address; 2: use remote_addr as the client IP address; 3: obtain the client IP address from the specified header field that is given in IpHeaders. (This value is effective when OpType is set to Status or Proxy.)
     */
    public void setProxy(Long Proxy) {
        this.Proxy = Proxy;
    }

    /**
     * Get This parameter indicates a custom header and is required when IsCdn is set to 3. (The value is effective when OpType is set to Status or Proxy.) 
     * @return IpHeaders This parameter indicates a custom header and is required when IsCdn is set to 3. (The value is effective when OpType is set to Status or Proxy.)
     */
    public String [] getIpHeaders() {
        return this.IpHeaders;
    }

    /**
     * Set This parameter indicates a custom header and is required when IsCdn is set to 3. (The value is effective when OpType is set to Status or Proxy.)
     * @param IpHeaders This parameter indicates a custom header and is required when IsCdn is set to 3. (The value is effective when OpType is set to Status or Proxy.)
     */
    public void setIpHeaders(String [] IpHeaders) {
        this.IpHeaders = IpHeaders;
    }

    public ModifyObjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyObjectRequest(ModifyObjectRequest source) {
        if (source.ObjectId != null) {
            this.ObjectId = new String(source.ObjectId);
        }
        if (source.OpType != null) {
            this.OpType = new String(source.OpType);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Proxy != null) {
            this.Proxy = new Long(source.Proxy);
        }
        if (source.IpHeaders != null) {
            this.IpHeaders = new String[source.IpHeaders.length];
            for (int i = 0; i < source.IpHeaders.length; i++) {
                this.IpHeaders[i] = new String(source.IpHeaders[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ObjectId", this.ObjectId);
        this.setParamSimple(map, prefix + "OpType", this.OpType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Proxy", this.Proxy);
        this.setParamArraySimple(map, prefix + "IpHeaders.", this.IpHeaders);

    }
}

