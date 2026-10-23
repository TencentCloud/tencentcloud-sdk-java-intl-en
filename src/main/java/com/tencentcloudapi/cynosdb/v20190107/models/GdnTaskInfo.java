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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GdnTaskInfo extends AbstractModel {

    /**
    * Global database unique ID
    */
    @SerializedName("GdnId")
    @Expose
    private String GdnId;

    /**
    * Unique alias of the global database
    */
    @SerializedName("GdnName")
    @Expose
    private String GdnName;

    /**
    * Primary cluster ID
    */
    @SerializedName("PrimaryClusterId")
    @Expose
    private String PrimaryClusterId;

    /**
    * Region of the primary cluster
    */
    @SerializedName("PrimaryClusterRegion")
    @Expose
    private String PrimaryClusterRegion;

    /**
    * From the cluster region
    */
    @SerializedName("StandbyClusterRegion")
    @Expose
    private String StandbyClusterRegion;

    /**
    * Slave cluster ID
    */
    @SerializedName("StandbyClusterId")
    @Expose
    private String StandbyClusterId;

    /**
    * From the cluster name
    */
    @SerializedName("StandbyClusterName")
    @Expose
    private String StandbyClusterName;

    /**
    * Whether a forced switchover has been performed
    */
    @SerializedName("ForceSwitchGdn")
    @Expose
    private String ForceSwitchGdn;

    /**
    * code
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * Prompt message
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Whether forced switchover is supported
    */
    @SerializedName("IsSupportForce")
    @Expose
    private String IsSupportForce;

    /**
     * Get Global database unique ID 
     * @return GdnId Global database unique ID
     */
    public String getGdnId() {
        return this.GdnId;
    }

    /**
     * Set Global database unique ID
     * @param GdnId Global database unique ID
     */
    public void setGdnId(String GdnId) {
        this.GdnId = GdnId;
    }

    /**
     * Get Unique alias of the global database 
     * @return GdnName Unique alias of the global database
     */
    public String getGdnName() {
        return this.GdnName;
    }

    /**
     * Set Unique alias of the global database
     * @param GdnName Unique alias of the global database
     */
    public void setGdnName(String GdnName) {
        this.GdnName = GdnName;
    }

    /**
     * Get Primary cluster ID 
     * @return PrimaryClusterId Primary cluster ID
     */
    public String getPrimaryClusterId() {
        return this.PrimaryClusterId;
    }

    /**
     * Set Primary cluster ID
     * @param PrimaryClusterId Primary cluster ID
     */
    public void setPrimaryClusterId(String PrimaryClusterId) {
        this.PrimaryClusterId = PrimaryClusterId;
    }

    /**
     * Get Region of the primary cluster 
     * @return PrimaryClusterRegion Region of the primary cluster
     */
    public String getPrimaryClusterRegion() {
        return this.PrimaryClusterRegion;
    }

    /**
     * Set Region of the primary cluster
     * @param PrimaryClusterRegion Region of the primary cluster
     */
    public void setPrimaryClusterRegion(String PrimaryClusterRegion) {
        this.PrimaryClusterRegion = PrimaryClusterRegion;
    }

    /**
     * Get From the cluster region 
     * @return StandbyClusterRegion From the cluster region
     */
    public String getStandbyClusterRegion() {
        return this.StandbyClusterRegion;
    }

    /**
     * Set From the cluster region
     * @param StandbyClusterRegion From the cluster region
     */
    public void setStandbyClusterRegion(String StandbyClusterRegion) {
        this.StandbyClusterRegion = StandbyClusterRegion;
    }

    /**
     * Get Slave cluster ID 
     * @return StandbyClusterId Slave cluster ID
     */
    public String getStandbyClusterId() {
        return this.StandbyClusterId;
    }

    /**
     * Set Slave cluster ID
     * @param StandbyClusterId Slave cluster ID
     */
    public void setStandbyClusterId(String StandbyClusterId) {
        this.StandbyClusterId = StandbyClusterId;
    }

    /**
     * Get From the cluster name 
     * @return StandbyClusterName From the cluster name
     */
    public String getStandbyClusterName() {
        return this.StandbyClusterName;
    }

    /**
     * Set From the cluster name
     * @param StandbyClusterName From the cluster name
     */
    public void setStandbyClusterName(String StandbyClusterName) {
        this.StandbyClusterName = StandbyClusterName;
    }

    /**
     * Get Whether a forced switchover has been performed 
     * @return ForceSwitchGdn Whether a forced switchover has been performed
     */
    public String getForceSwitchGdn() {
        return this.ForceSwitchGdn;
    }

    /**
     * Set Whether a forced switchover has been performed
     * @param ForceSwitchGdn Whether a forced switchover has been performed
     */
    public void setForceSwitchGdn(String ForceSwitchGdn) {
        this.ForceSwitchGdn = ForceSwitchGdn;
    }

    /**
     * Get code 
     * @return Code code
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set code
     * @param Code code
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Get Prompt message 
     * @return Message Prompt message
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Prompt message
     * @param Message Prompt message
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Whether forced switchover is supported 
     * @return IsSupportForce Whether forced switchover is supported
     */
    public String getIsSupportForce() {
        return this.IsSupportForce;
    }

    /**
     * Set Whether forced switchover is supported
     * @param IsSupportForce Whether forced switchover is supported
     */
    public void setIsSupportForce(String IsSupportForce) {
        this.IsSupportForce = IsSupportForce;
    }

    public GdnTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GdnTaskInfo(GdnTaskInfo source) {
        if (source.GdnId != null) {
            this.GdnId = new String(source.GdnId);
        }
        if (source.GdnName != null) {
            this.GdnName = new String(source.GdnName);
        }
        if (source.PrimaryClusterId != null) {
            this.PrimaryClusterId = new String(source.PrimaryClusterId);
        }
        if (source.PrimaryClusterRegion != null) {
            this.PrimaryClusterRegion = new String(source.PrimaryClusterRegion);
        }
        if (source.StandbyClusterRegion != null) {
            this.StandbyClusterRegion = new String(source.StandbyClusterRegion);
        }
        if (source.StandbyClusterId != null) {
            this.StandbyClusterId = new String(source.StandbyClusterId);
        }
        if (source.StandbyClusterName != null) {
            this.StandbyClusterName = new String(source.StandbyClusterName);
        }
        if (source.ForceSwitchGdn != null) {
            this.ForceSwitchGdn = new String(source.ForceSwitchGdn);
        }
        if (source.Code != null) {
            this.Code = new Long(source.Code);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.IsSupportForce != null) {
            this.IsSupportForce = new String(source.IsSupportForce);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GdnId", this.GdnId);
        this.setParamSimple(map, prefix + "GdnName", this.GdnName);
        this.setParamSimple(map, prefix + "PrimaryClusterId", this.PrimaryClusterId);
        this.setParamSimple(map, prefix + "PrimaryClusterRegion", this.PrimaryClusterRegion);
        this.setParamSimple(map, prefix + "StandbyClusterRegion", this.StandbyClusterRegion);
        this.setParamSimple(map, prefix + "StandbyClusterId", this.StandbyClusterId);
        this.setParamSimple(map, prefix + "StandbyClusterName", this.StandbyClusterName);
        this.setParamSimple(map, prefix + "ForceSwitchGdn", this.ForceSwitchGdn);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "IsSupportForce", this.IsSupportForce);

    }
}

