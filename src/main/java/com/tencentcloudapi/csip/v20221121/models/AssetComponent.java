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

public class AssetComponent extends AbstractModel {

    /**
    * <p>Component name.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Component version</p>
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * <p>Component type</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>First discovery time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
    */
    @SerializedName("FirstFoundTime")
    @Expose
    private String FirstFoundTime;

    /**
    * <p>Last discovery time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
    */
    @SerializedName("LatestFoundTime")
    @Expose
    private String LatestFoundTime;

    /**
    * <p>Component id</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>Component associated account name</p>
    */
    @SerializedName("OwnerAccountName")
    @Expose
    private String OwnerAccountName;

    /**
    * <p>appid of the account associated with the component</p>
    */
    @SerializedName("OwnerAppId")
    @Expose
    private Long OwnerAppId;

    /**
    * <p>Account uin associated with the component</p>
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * <p>Numbers of affected images</p>
    */
    @SerializedName("AffectedImageCount")
    @Expose
    private Long AffectedImageCount;

    /**
     * Get <p>Component name.</p> 
     * @return Name <p>Component name.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Component name.</p>
     * @param Name <p>Component name.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Component version</p> 
     * @return Version <p>Component version</p>
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set <p>Component version</p>
     * @param Version <p>Component version</p>
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get <p>Component type</p> 
     * @return Type <p>Component type</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Component type</p>
     * @param Type <p>Component type</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>First discovery time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p> 
     * @return FirstFoundTime <p>First discovery time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     */
    public String getFirstFoundTime() {
        return this.FirstFoundTime;
    }

    /**
     * Set <p>First discovery time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     * @param FirstFoundTime <p>First discovery time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     */
    public void setFirstFoundTime(String FirstFoundTime) {
        this.FirstFoundTime = FirstFoundTime;
    }

    /**
     * Get <p>Last discovery time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p> 
     * @return LatestFoundTime <p>Last discovery time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     */
    public String getLatestFoundTime() {
        return this.LatestFoundTime;
    }

    /**
     * Set <p>Last discovery time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     * @param LatestFoundTime <p>Last discovery time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     */
    public void setLatestFoundTime(String LatestFoundTime) {
        this.LatestFoundTime = LatestFoundTime;
    }

    /**
     * Get <p>Component id</p> 
     * @return Id <p>Component id</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>Component id</p>
     * @param Id <p>Component id</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>Component associated account name</p> 
     * @return OwnerAccountName <p>Component associated account name</p>
     */
    public String getOwnerAccountName() {
        return this.OwnerAccountName;
    }

    /**
     * Set <p>Component associated account name</p>
     * @param OwnerAccountName <p>Component associated account name</p>
     */
    public void setOwnerAccountName(String OwnerAccountName) {
        this.OwnerAccountName = OwnerAccountName;
    }

    /**
     * Get <p>appid of the account associated with the component</p> 
     * @return OwnerAppId <p>appid of the account associated with the component</p>
     */
    public Long getOwnerAppId() {
        return this.OwnerAppId;
    }

    /**
     * Set <p>appid of the account associated with the component</p>
     * @param OwnerAppId <p>appid of the account associated with the component</p>
     */
    public void setOwnerAppId(Long OwnerAppId) {
        this.OwnerAppId = OwnerAppId;
    }

    /**
     * Get <p>Account uin associated with the component</p> 
     * @return OwnerUin <p>Account uin associated with the component</p>
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set <p>Account uin associated with the component</p>
     * @param OwnerUin <p>Account uin associated with the component</p>
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get <p>Numbers of affected images</p> 
     * @return AffectedImageCount <p>Numbers of affected images</p>
     */
    public Long getAffectedImageCount() {
        return this.AffectedImageCount;
    }

    /**
     * Set <p>Numbers of affected images</p>
     * @param AffectedImageCount <p>Numbers of affected images</p>
     */
    public void setAffectedImageCount(Long AffectedImageCount) {
        this.AffectedImageCount = AffectedImageCount;
    }

    public AssetComponent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetComponent(AssetComponent source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.FirstFoundTime != null) {
            this.FirstFoundTime = new String(source.FirstFoundTime);
        }
        if (source.LatestFoundTime != null) {
            this.LatestFoundTime = new String(source.LatestFoundTime);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.OwnerAccountName != null) {
            this.OwnerAccountName = new String(source.OwnerAccountName);
        }
        if (source.OwnerAppId != null) {
            this.OwnerAppId = new Long(source.OwnerAppId);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.AffectedImageCount != null) {
            this.AffectedImageCount = new Long(source.AffectedImageCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "FirstFoundTime", this.FirstFoundTime);
        this.setParamSimple(map, prefix + "LatestFoundTime", this.LatestFoundTime);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "OwnerAccountName", this.OwnerAccountName);
        this.setParamSimple(map, prefix + "OwnerAppId", this.OwnerAppId);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "AffectedImageCount", this.AffectedImageCount);

    }
}

