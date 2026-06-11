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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddOrModifyMaliciousConnectionWhiteListRequest extends AbstractModel {

    /**
    * Enumerate
IP: IP
Domain name: DOMAIN
    */
    @SerializedName("RequestType")
    @Expose
    private String RequestType;

    /**
    * Allowlisted domain names
    */
    @SerializedName("WhiteDomainList")
    @Expose
    private String [] WhiteDomainList;

    /**
    * Allowlisted IP
    */
    @SerializedName("WhiteIPList")
    @Expose
    private String [] WhiteIPList;

    /**
    * Remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Allowlist Record ID, Required Only for Modification
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
     * Get Enumerate
IP: IP
Domain name: DOMAIN 
     * @return RequestType Enumerate
IP: IP
Domain name: DOMAIN
     */
    public String getRequestType() {
        return this.RequestType;
    }

    /**
     * Set Enumerate
IP: IP
Domain name: DOMAIN
     * @param RequestType Enumerate
IP: IP
Domain name: DOMAIN
     */
    public void setRequestType(String RequestType) {
        this.RequestType = RequestType;
    }

    /**
     * Get Allowlisted domain names 
     * @return WhiteDomainList Allowlisted domain names
     */
    public String [] getWhiteDomainList() {
        return this.WhiteDomainList;
    }

    /**
     * Set Allowlisted domain names
     * @param WhiteDomainList Allowlisted domain names
     */
    public void setWhiteDomainList(String [] WhiteDomainList) {
        this.WhiteDomainList = WhiteDomainList;
    }

    /**
     * Get Allowlisted IP 
     * @return WhiteIPList Allowlisted IP
     */
    public String [] getWhiteIPList() {
        return this.WhiteIPList;
    }

    /**
     * Set Allowlisted IP
     * @param WhiteIPList Allowlisted IP
     */
    public void setWhiteIPList(String [] WhiteIPList) {
        this.WhiteIPList = WhiteIPList;
    }

    /**
     * Get Remarks 
     * @return Remark Remarks
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks
     * @param Remark Remarks
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Allowlist Record ID, Required Only for Modification 
     * @return ID Allowlist Record ID, Required Only for Modification
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set Allowlist Record ID, Required Only for Modification
     * @param ID Allowlist Record ID, Required Only for Modification
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    public AddOrModifyMaliciousConnectionWhiteListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddOrModifyMaliciousConnectionWhiteListRequest(AddOrModifyMaliciousConnectionWhiteListRequest source) {
        if (source.RequestType != null) {
            this.RequestType = new String(source.RequestType);
        }
        if (source.WhiteDomainList != null) {
            this.WhiteDomainList = new String[source.WhiteDomainList.length];
            for (int i = 0; i < source.WhiteDomainList.length; i++) {
                this.WhiteDomainList[i] = new String(source.WhiteDomainList[i]);
            }
        }
        if (source.WhiteIPList != null) {
            this.WhiteIPList = new String[source.WhiteIPList.length];
            for (int i = 0; i < source.WhiteIPList.length; i++) {
                this.WhiteIPList[i] = new String(source.WhiteIPList[i]);
            }
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RequestType", this.RequestType);
        this.setParamArraySimple(map, prefix + "WhiteDomainList.", this.WhiteDomainList);
        this.setParamArraySimple(map, prefix + "WhiteIPList.", this.WhiteIPList);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "ID", this.ID);

    }
}

