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

public class CreateExposureAutoTagRuleRequest extends AbstractModel {

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>rule name</p>
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * <p>Tag.</p>
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * <p>Rule description</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Rule opening status</p>
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * <p>Asset type</p>
    */
    @SerializedName("AssetTypes")
    @Expose
    private String [] AssetTypes;

    /**
    * <p>Port</p>
    */
    @SerializedName("Ports")
    @Expose
    private String [] Ports;

    /**
    * <p>Open status</p>
    */
    @SerializedName("OpenStatuses")
    @Expose
    private String [] OpenStatuses;

    /**
    * <p>Whether to execute the policy immediately</p>
    */
    @SerializedName("ApplyNow")
    @Expose
    private Boolean ApplyNow;

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
     * Get <p>rule name</p> 
     * @return RuleName <p>rule name</p>
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set <p>rule name</p>
     * @param RuleName <p>rule name</p>
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get <p>Tag.</p> 
     * @return Tag <p>Tag.</p>
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set <p>Tag.</p>
     * @param Tag <p>Tag.</p>
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * Get <p>Rule description</p> 
     * @return Description <p>Rule description</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Rule description</p>
     * @param Description <p>Rule description</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Rule opening status</p> 
     * @return Enable <p>Rule opening status</p>
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>Rule opening status</p>
     * @param Enable <p>Rule opening status</p>
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>Asset type</p> 
     * @return AssetTypes <p>Asset type</p>
     */
    public String [] getAssetTypes() {
        return this.AssetTypes;
    }

    /**
     * Set <p>Asset type</p>
     * @param AssetTypes <p>Asset type</p>
     */
    public void setAssetTypes(String [] AssetTypes) {
        this.AssetTypes = AssetTypes;
    }

    /**
     * Get <p>Port</p> 
     * @return Ports <p>Port</p>
     */
    public String [] getPorts() {
        return this.Ports;
    }

    /**
     * Set <p>Port</p>
     * @param Ports <p>Port</p>
     */
    public void setPorts(String [] Ports) {
        this.Ports = Ports;
    }

    /**
     * Get <p>Open status</p> 
     * @return OpenStatuses <p>Open status</p>
     */
    public String [] getOpenStatuses() {
        return this.OpenStatuses;
    }

    /**
     * Set <p>Open status</p>
     * @param OpenStatuses <p>Open status</p>
     */
    public void setOpenStatuses(String [] OpenStatuses) {
        this.OpenStatuses = OpenStatuses;
    }

    /**
     * Get <p>Whether to execute the policy immediately</p> 
     * @return ApplyNow <p>Whether to execute the policy immediately</p>
     */
    public Boolean getApplyNow() {
        return this.ApplyNow;
    }

    /**
     * Set <p>Whether to execute the policy immediately</p>
     * @param ApplyNow <p>Whether to execute the policy immediately</p>
     */
    public void setApplyNow(Boolean ApplyNow) {
        this.ApplyNow = ApplyNow;
    }

    public CreateExposureAutoTagRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateExposureAutoTagRuleRequest(CreateExposureAutoTagRuleRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.AssetTypes != null) {
            this.AssetTypes = new String[source.AssetTypes.length];
            for (int i = 0; i < source.AssetTypes.length; i++) {
                this.AssetTypes[i] = new String(source.AssetTypes[i]);
            }
        }
        if (source.Ports != null) {
            this.Ports = new String[source.Ports.length];
            for (int i = 0; i < source.Ports.length; i++) {
                this.Ports[i] = new String(source.Ports[i]);
            }
        }
        if (source.OpenStatuses != null) {
            this.OpenStatuses = new String[source.OpenStatuses.length];
            for (int i = 0; i < source.OpenStatuses.length; i++) {
                this.OpenStatuses[i] = new String(source.OpenStatuses[i]);
            }
        }
        if (source.ApplyNow != null) {
            this.ApplyNow = new Boolean(source.ApplyNow);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Tag", this.Tag);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamArraySimple(map, prefix + "AssetTypes.", this.AssetTypes);
        this.setParamArraySimple(map, prefix + "Ports.", this.Ports);
        this.setParamArraySimple(map, prefix + "OpenStatuses.", this.OpenStatuses);
        this.setParamSimple(map, prefix + "ApplyNow", this.ApplyNow);

    }
}

