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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SkillReferenceSummary extends AbstractModel {

    /**
    * <p>Associated ID</p>
    */
    @SerializedName("ReferenceId")
    @Expose
    private String ReferenceId;

    /**
    * <p>Association name</p>
    */
    @SerializedName("ReferenceName")
    @Expose
    private String ReferenceName;

    /**
    * <p>Association type</p><p>Enumeration values:<br>| uint | Description |<br>| --- | --- |<br>| 0 | Placeholder |<br>| 1 | ClawPro |<br>| 2 | agent |</p>
    */
    @SerializedName("ReferenceType")
    @Expose
    private Long ReferenceType;

    /**
    * <p>Space ID</p>
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * <p>Space name</p>
    */
    @SerializedName("SpaceName")
    @Expose
    private String SpaceName;

    /**
    * <p>Reference instance owner</p>
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * <p>Application identifier</p>
    */
    @SerializedName("AppIdentity")
    @Expose
    private AppIdentity AppIdentity;

    /**
     * Get <p>Associated ID</p> 
     * @return ReferenceId <p>Associated ID</p>
     */
    public String getReferenceId() {
        return this.ReferenceId;
    }

    /**
     * Set <p>Associated ID</p>
     * @param ReferenceId <p>Associated ID</p>
     */
    public void setReferenceId(String ReferenceId) {
        this.ReferenceId = ReferenceId;
    }

    /**
     * Get <p>Association name</p> 
     * @return ReferenceName <p>Association name</p>
     */
    public String getReferenceName() {
        return this.ReferenceName;
    }

    /**
     * Set <p>Association name</p>
     * @param ReferenceName <p>Association name</p>
     */
    public void setReferenceName(String ReferenceName) {
        this.ReferenceName = ReferenceName;
    }

    /**
     * Get <p>Association type</p><p>Enumeration values:<br>| uint | Description |<br>| --- | --- |<br>| 0 | Placeholder |<br>| 1 | ClawPro |<br>| 2 | agent |</p> 
     * @return ReferenceType <p>Association type</p><p>Enumeration values:<br>| uint | Description |<br>| --- | --- |<br>| 0 | Placeholder |<br>| 1 | ClawPro |<br>| 2 | agent |</p>
     */
    public Long getReferenceType() {
        return this.ReferenceType;
    }

    /**
     * Set <p>Association type</p><p>Enumeration values:<br>| uint | Description |<br>| --- | --- |<br>| 0 | Placeholder |<br>| 1 | ClawPro |<br>| 2 | agent |</p>
     * @param ReferenceType <p>Association type</p><p>Enumeration values:<br>| uint | Description |<br>| --- | --- |<br>| 0 | Placeholder |<br>| 1 | ClawPro |<br>| 2 | agent |</p>
     */
    public void setReferenceType(Long ReferenceType) {
        this.ReferenceType = ReferenceType;
    }

    /**
     * Get <p>Space ID</p> 
     * @return SpaceId <p>Space ID</p>
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set <p>Space ID</p>
     * @param SpaceId <p>Space ID</p>
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get <p>Space name</p> 
     * @return SpaceName <p>Space name</p>
     */
    public String getSpaceName() {
        return this.SpaceName;
    }

    /**
     * Set <p>Space name</p>
     * @param SpaceName <p>Space name</p>
     */
    public void setSpaceName(String SpaceName) {
        this.SpaceName = SpaceName;
    }

    /**
     * Get <p>Reference instance owner</p> 
     * @return Owner <p>Reference instance owner</p>
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set <p>Reference instance owner</p>
     * @param Owner <p>Reference instance owner</p>
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get <p>Application identifier</p> 
     * @return AppIdentity <p>Application identifier</p>
     */
    public AppIdentity getAppIdentity() {
        return this.AppIdentity;
    }

    /**
     * Set <p>Application identifier</p>
     * @param AppIdentity <p>Application identifier</p>
     */
    public void setAppIdentity(AppIdentity AppIdentity) {
        this.AppIdentity = AppIdentity;
    }

    public SkillReferenceSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SkillReferenceSummary(SkillReferenceSummary source) {
        if (source.ReferenceId != null) {
            this.ReferenceId = new String(source.ReferenceId);
        }
        if (source.ReferenceName != null) {
            this.ReferenceName = new String(source.ReferenceName);
        }
        if (source.ReferenceType != null) {
            this.ReferenceType = new Long(source.ReferenceType);
        }
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
        if (source.SpaceName != null) {
            this.SpaceName = new String(source.SpaceName);
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
        if (source.AppIdentity != null) {
            this.AppIdentity = new AppIdentity(source.AppIdentity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReferenceId", this.ReferenceId);
        this.setParamSimple(map, prefix + "ReferenceName", this.ReferenceName);
        this.setParamSimple(map, prefix + "ReferenceType", this.ReferenceType);
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamSimple(map, prefix + "SpaceName", this.SpaceName);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamObj(map, prefix + "AppIdentity.", this.AppIdentity);

    }
}

