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

public class CreateDspmIdentifyComplianceGroupCopyRequest extends AbstractModel {

    /**
    * <p>Source template ID</p>
    */
    @SerializedName("FromId")
    @Expose
    private Long FromId;

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Template name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Template description</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Operation source: empty/dspm=Database risk monitoring entry, cos=Object storage risk monitoring entry</p>
    */
    @SerializedName("OperationSource")
    @Expose
    private String OperationSource;

    /**
     * Get <p>Source template ID</p> 
     * @return FromId <p>Source template ID</p>
     */
    public Long getFromId() {
        return this.FromId;
    }

    /**
     * Set <p>Source template ID</p>
     * @param FromId <p>Source template ID</p>
     */
    public void setFromId(Long FromId) {
        this.FromId = FromId;
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
     * Get <p>Template name</p> 
     * @return Name <p>Template name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Template name</p>
     * @param Name <p>Template name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Template description</p> 
     * @return Description <p>Template description</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Template description</p>
     * @param Description <p>Template description</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Operation source: empty/dspm=Database risk monitoring entry, cos=Object storage risk monitoring entry</p> 
     * @return OperationSource <p>Operation source: empty/dspm=Database risk monitoring entry, cos=Object storage risk monitoring entry</p>
     */
    public String getOperationSource() {
        return this.OperationSource;
    }

    /**
     * Set <p>Operation source: empty/dspm=Database risk monitoring entry, cos=Object storage risk monitoring entry</p>
     * @param OperationSource <p>Operation source: empty/dspm=Database risk monitoring entry, cos=Object storage risk monitoring entry</p>
     */
    public void setOperationSource(String OperationSource) {
        this.OperationSource = OperationSource;
    }

    public CreateDspmIdentifyComplianceGroupCopyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDspmIdentifyComplianceGroupCopyRequest(CreateDspmIdentifyComplianceGroupCopyRequest source) {
        if (source.FromId != null) {
            this.FromId = new Long(source.FromId);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.OperationSource != null) {
            this.OperationSource = new String(source.OperationSource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FromId", this.FromId);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "OperationSource", this.OperationSource);

    }
}

