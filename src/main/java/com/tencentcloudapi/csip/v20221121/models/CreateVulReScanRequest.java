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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateVulReScanRequest extends AbstractModel {

    /**
    * <p>Vulnerability ID</p>
    */
    @SerializedName("VulId")
    @Expose
    private Long [] VulId;

    /**
    * <p>Patch Number</p>
    */
    @SerializedName("KbNo")
    @Expose
    private String [] KbNo;

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Asset list</p>
    */
    @SerializedName("AssetList")
    @Expose
    private String [] AssetList;

    /**
     * Get <p>Vulnerability ID</p> 
     * @return VulId <p>Vulnerability ID</p>
     */
    public Long [] getVulId() {
        return this.VulId;
    }

    /**
     * Set <p>Vulnerability ID</p>
     * @param VulId <p>Vulnerability ID</p>
     */
    public void setVulId(Long [] VulId) {
        this.VulId = VulId;
    }

    /**
     * Get <p>Patch Number</p> 
     * @return KbNo <p>Patch Number</p>
     */
    public String [] getKbNo() {
        return this.KbNo;
    }

    /**
     * Set <p>Patch Number</p>
     * @param KbNo <p>Patch Number</p>
     */
    public void setKbNo(String [] KbNo) {
        this.KbNo = KbNo;
    }

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>Asset list</p> 
     * @return AssetList <p>Asset list</p>
     */
    public String [] getAssetList() {
        return this.AssetList;
    }

    /**
     * Set <p>Asset list</p>
     * @param AssetList <p>Asset list</p>
     */
    public void setAssetList(String [] AssetList) {
        this.AssetList = AssetList;
    }

    public CreateVulReScanRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVulReScanRequest(CreateVulReScanRequest source) {
        if (source.VulId != null) {
            this.VulId = new Long[source.VulId.length];
            for (int i = 0; i < source.VulId.length; i++) {
                this.VulId[i] = new Long(source.VulId[i]);
            }
        }
        if (source.KbNo != null) {
            this.KbNo = new String[source.KbNo.length];
            for (int i = 0; i < source.KbNo.length; i++) {
                this.KbNo[i] = new String(source.KbNo[i]);
            }
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.AssetList != null) {
            this.AssetList = new String[source.AssetList.length];
            for (int i = 0; i < source.AssetList.length; i++) {
                this.AssetList[i] = new String(source.AssetList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "VulId.", this.VulId);
        this.setParamArraySimple(map, prefix + "KbNo.", this.KbNo);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArraySimple(map, prefix + "AssetList.", this.AssetList);

    }
}

