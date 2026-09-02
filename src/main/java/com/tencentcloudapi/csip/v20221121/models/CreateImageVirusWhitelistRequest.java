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

public class CreateImageVirusWhitelistRequest extends AbstractModel {

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Trojan whitelist md5</p>
    */
    @SerializedName("Md5List")
    @Expose
    private String [] Md5List;

    /**
    * <p>Whitelist effective range</p><p>Enumeration values:</p><ul><li>0: Selected images</li><li>1: All images</li></ul>
    */
    @SerializedName("Scope")
    @Expose
    private Long Scope;

    /**
    * <p>Image ID.</p>
    */
    @SerializedName("ImageIds")
    @Expose
    private Long [] ImageIds;

    /**
    * <p>Remarks.</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>Trojan id</p>
    */
    @SerializedName("VirusId")
    @Expose
    private Long [] VirusId;

    /**
    * <p>Trojan whitelist name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Status</p><p>Enumeration values:</p><ul><li>0: Disabled</li><li>1: Enabled</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

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
     * Get <p>Trojan whitelist md5</p> 
     * @return Md5List <p>Trojan whitelist md5</p>
     */
    public String [] getMd5List() {
        return this.Md5List;
    }

    /**
     * Set <p>Trojan whitelist md5</p>
     * @param Md5List <p>Trojan whitelist md5</p>
     */
    public void setMd5List(String [] Md5List) {
        this.Md5List = Md5List;
    }

    /**
     * Get <p>Whitelist effective range</p><p>Enumeration values:</p><ul><li>0: Selected images</li><li>1: All images</li></ul> 
     * @return Scope <p>Whitelist effective range</p><p>Enumeration values:</p><ul><li>0: Selected images</li><li>1: All images</li></ul>
     */
    public Long getScope() {
        return this.Scope;
    }

    /**
     * Set <p>Whitelist effective range</p><p>Enumeration values:</p><ul><li>0: Selected images</li><li>1: All images</li></ul>
     * @param Scope <p>Whitelist effective range</p><p>Enumeration values:</p><ul><li>0: Selected images</li><li>1: All images</li></ul>
     */
    public void setScope(Long Scope) {
        this.Scope = Scope;
    }

    /**
     * Get <p>Image ID.</p> 
     * @return ImageIds <p>Image ID.</p>
     */
    public Long [] getImageIds() {
        return this.ImageIds;
    }

    /**
     * Set <p>Image ID.</p>
     * @param ImageIds <p>Image ID.</p>
     */
    public void setImageIds(Long [] ImageIds) {
        this.ImageIds = ImageIds;
    }

    /**
     * Get <p>Remarks.</p> 
     * @return Remark <p>Remarks.</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>Remarks.</p>
     * @param Remark <p>Remarks.</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>Trojan id</p> 
     * @return VirusId <p>Trojan id</p>
     */
    public Long [] getVirusId() {
        return this.VirusId;
    }

    /**
     * Set <p>Trojan id</p>
     * @param VirusId <p>Trojan id</p>
     */
    public void setVirusId(Long [] VirusId) {
        this.VirusId = VirusId;
    }

    /**
     * Get <p>Trojan whitelist name</p> 
     * @return Name <p>Trojan whitelist name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Trojan whitelist name</p>
     * @param Name <p>Trojan whitelist name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Status</p><p>Enumeration values:</p><ul><li>0: Disabled</li><li>1: Enabled</li></ul> 
     * @return Status <p>Status</p><p>Enumeration values:</p><ul><li>0: Disabled</li><li>1: Enabled</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Status</p><p>Enumeration values:</p><ul><li>0: Disabled</li><li>1: Enabled</li></ul>
     * @param Status <p>Status</p><p>Enumeration values:</p><ul><li>0: Disabled</li><li>1: Enabled</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public CreateImageVirusWhitelistRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateImageVirusWhitelistRequest(CreateImageVirusWhitelistRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Md5List != null) {
            this.Md5List = new String[source.Md5List.length];
            for (int i = 0; i < source.Md5List.length; i++) {
                this.Md5List[i] = new String(source.Md5List[i]);
            }
        }
        if (source.Scope != null) {
            this.Scope = new Long(source.Scope);
        }
        if (source.ImageIds != null) {
            this.ImageIds = new Long[source.ImageIds.length];
            for (int i = 0; i < source.ImageIds.length; i++) {
                this.ImageIds[i] = new Long(source.ImageIds[i]);
            }
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.VirusId != null) {
            this.VirusId = new Long[source.VirusId.length];
            for (int i = 0; i < source.VirusId.length; i++) {
                this.VirusId[i] = new Long(source.VirusId[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArraySimple(map, prefix + "Md5List.", this.Md5List);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamArraySimple(map, prefix + "ImageIds.", this.ImageIds);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArraySimple(map, prefix + "VirusId.", this.VirusId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

