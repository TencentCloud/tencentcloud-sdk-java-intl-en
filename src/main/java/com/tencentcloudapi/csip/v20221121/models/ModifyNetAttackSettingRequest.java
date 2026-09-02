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

public class ModifyNetAttackSettingRequest extends AbstractModel {

    /**
    * <p>0: disable network attack detection; 1: enable network attack detection</p>
    */
    @SerializedName("NetAttackEnable")
    @Expose
    private Long NetAttackEnable;

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>0: new warning events pending processing by default; 1: new warning events processed by default; 3: new warning events ignored by default</p>
    */
    @SerializedName("NetAttackAlarmStatus")
    @Expose
    private Long NetAttackAlarmStatus;

    /**
    * <p>Automatic inclusion of new assets: 0 means not included, and 1 means included</p>
    */
    @SerializedName("AutoInclude")
    @Expose
    private Long AutoInclude;

    /**
    * <p>Host range: 0 - specify 1 - all 2 - Pro Edition 3 - Flagship Edition 4 - Pro + Flagship</p>
    */
    @SerializedName("CWPScope")
    @Expose
    private Long CWPScope;

    /**
    * <p>Specify the host list (used when CWPScope=0)</p>
    */
    @SerializedName("InstanceIDsWithAppId")
    @Expose
    private InstanceIDWithAppIdItem [] InstanceIDsWithAppId;

    /**
    * <p>Host exclusion list</p>
    */
    @SerializedName("ExcludeInstanceIDsWithAppId")
    @Expose
    private InstanceIDWithAppIdItem [] ExcludeInstanceIDsWithAppId;

    /**
    * <p>Tag ID list</p>
    */
    @SerializedName("TagIDs")
    @Expose
    private String [] TagIDs;

    /**
    * <p>Container scope: 0-within specified clusters 1-all clusters</p>
    */
    @SerializedName("TCSSScope")
    @Expose
    private Long TCSSScope;

    /**
    * <p>Specify the cluster list (used when TCSSScope=0)</p>
    */
    @SerializedName("ClusterIDsWithAppId")
    @Expose
    private ClusterIDWithAppIdItem [] ClusterIDsWithAppId;

    /**
    * <p>Cluster exclusion list</p>
    */
    @SerializedName("ExcludeClusterIDsWithAppId")
    @Expose
    private ClusterIDWithAppIdItem [] ExcludeClusterIDsWithAppId;

    /**
     * Get <p>0: disable network attack detection; 1: enable network attack detection</p> 
     * @return NetAttackEnable <p>0: disable network attack detection; 1: enable network attack detection</p>
     */
    public Long getNetAttackEnable() {
        return this.NetAttackEnable;
    }

    /**
     * Set <p>0: disable network attack detection; 1: enable network attack detection</p>
     * @param NetAttackEnable <p>0: disable network attack detection; 1: enable network attack detection</p>
     */
    public void setNetAttackEnable(Long NetAttackEnable) {
        this.NetAttackEnable = NetAttackEnable;
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
     * Get <p>0: new warning events pending processing by default; 1: new warning events processed by default; 3: new warning events ignored by default</p> 
     * @return NetAttackAlarmStatus <p>0: new warning events pending processing by default; 1: new warning events processed by default; 3: new warning events ignored by default</p>
     */
    public Long getNetAttackAlarmStatus() {
        return this.NetAttackAlarmStatus;
    }

    /**
     * Set <p>0: new warning events pending processing by default; 1: new warning events processed by default; 3: new warning events ignored by default</p>
     * @param NetAttackAlarmStatus <p>0: new warning events pending processing by default; 1: new warning events processed by default; 3: new warning events ignored by default</p>
     */
    public void setNetAttackAlarmStatus(Long NetAttackAlarmStatus) {
        this.NetAttackAlarmStatus = NetAttackAlarmStatus;
    }

    /**
     * Get <p>Automatic inclusion of new assets: 0 means not included, and 1 means included</p> 
     * @return AutoInclude <p>Automatic inclusion of new assets: 0 means not included, and 1 means included</p>
     */
    public Long getAutoInclude() {
        return this.AutoInclude;
    }

    /**
     * Set <p>Automatic inclusion of new assets: 0 means not included, and 1 means included</p>
     * @param AutoInclude <p>Automatic inclusion of new assets: 0 means not included, and 1 means included</p>
     */
    public void setAutoInclude(Long AutoInclude) {
        this.AutoInclude = AutoInclude;
    }

    /**
     * Get <p>Host range: 0 - specify 1 - all 2 - Pro Edition 3 - Flagship Edition 4 - Pro + Flagship</p> 
     * @return CWPScope <p>Host range: 0 - specify 1 - all 2 - Pro Edition 3 - Flagship Edition 4 - Pro + Flagship</p>
     */
    public Long getCWPScope() {
        return this.CWPScope;
    }

    /**
     * Set <p>Host range: 0 - specify 1 - all 2 - Pro Edition 3 - Flagship Edition 4 - Pro + Flagship</p>
     * @param CWPScope <p>Host range: 0 - specify 1 - all 2 - Pro Edition 3 - Flagship Edition 4 - Pro + Flagship</p>
     */
    public void setCWPScope(Long CWPScope) {
        this.CWPScope = CWPScope;
    }

    /**
     * Get <p>Specify the host list (used when CWPScope=0)</p> 
     * @return InstanceIDsWithAppId <p>Specify the host list (used when CWPScope=0)</p>
     */
    public InstanceIDWithAppIdItem [] getInstanceIDsWithAppId() {
        return this.InstanceIDsWithAppId;
    }

    /**
     * Set <p>Specify the host list (used when CWPScope=0)</p>
     * @param InstanceIDsWithAppId <p>Specify the host list (used when CWPScope=0)</p>
     */
    public void setInstanceIDsWithAppId(InstanceIDWithAppIdItem [] InstanceIDsWithAppId) {
        this.InstanceIDsWithAppId = InstanceIDsWithAppId;
    }

    /**
     * Get <p>Host exclusion list</p> 
     * @return ExcludeInstanceIDsWithAppId <p>Host exclusion list</p>
     */
    public InstanceIDWithAppIdItem [] getExcludeInstanceIDsWithAppId() {
        return this.ExcludeInstanceIDsWithAppId;
    }

    /**
     * Set <p>Host exclusion list</p>
     * @param ExcludeInstanceIDsWithAppId <p>Host exclusion list</p>
     */
    public void setExcludeInstanceIDsWithAppId(InstanceIDWithAppIdItem [] ExcludeInstanceIDsWithAppId) {
        this.ExcludeInstanceIDsWithAppId = ExcludeInstanceIDsWithAppId;
    }

    /**
     * Get <p>Tag ID list</p> 
     * @return TagIDs <p>Tag ID list</p>
     */
    public String [] getTagIDs() {
        return this.TagIDs;
    }

    /**
     * Set <p>Tag ID list</p>
     * @param TagIDs <p>Tag ID list</p>
     */
    public void setTagIDs(String [] TagIDs) {
        this.TagIDs = TagIDs;
    }

    /**
     * Get <p>Container scope: 0-within specified clusters 1-all clusters</p> 
     * @return TCSSScope <p>Container scope: 0-within specified clusters 1-all clusters</p>
     */
    public Long getTCSSScope() {
        return this.TCSSScope;
    }

    /**
     * Set <p>Container scope: 0-within specified clusters 1-all clusters</p>
     * @param TCSSScope <p>Container scope: 0-within specified clusters 1-all clusters</p>
     */
    public void setTCSSScope(Long TCSSScope) {
        this.TCSSScope = TCSSScope;
    }

    /**
     * Get <p>Specify the cluster list (used when TCSSScope=0)</p> 
     * @return ClusterIDsWithAppId <p>Specify the cluster list (used when TCSSScope=0)</p>
     */
    public ClusterIDWithAppIdItem [] getClusterIDsWithAppId() {
        return this.ClusterIDsWithAppId;
    }

    /**
     * Set <p>Specify the cluster list (used when TCSSScope=0)</p>
     * @param ClusterIDsWithAppId <p>Specify the cluster list (used when TCSSScope=0)</p>
     */
    public void setClusterIDsWithAppId(ClusterIDWithAppIdItem [] ClusterIDsWithAppId) {
        this.ClusterIDsWithAppId = ClusterIDsWithAppId;
    }

    /**
     * Get <p>Cluster exclusion list</p> 
     * @return ExcludeClusterIDsWithAppId <p>Cluster exclusion list</p>
     */
    public ClusterIDWithAppIdItem [] getExcludeClusterIDsWithAppId() {
        return this.ExcludeClusterIDsWithAppId;
    }

    /**
     * Set <p>Cluster exclusion list</p>
     * @param ExcludeClusterIDsWithAppId <p>Cluster exclusion list</p>
     */
    public void setExcludeClusterIDsWithAppId(ClusterIDWithAppIdItem [] ExcludeClusterIDsWithAppId) {
        this.ExcludeClusterIDsWithAppId = ExcludeClusterIDsWithAppId;
    }

    public ModifyNetAttackSettingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNetAttackSettingRequest(ModifyNetAttackSettingRequest source) {
        if (source.NetAttackEnable != null) {
            this.NetAttackEnable = new Long(source.NetAttackEnable);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.NetAttackAlarmStatus != null) {
            this.NetAttackAlarmStatus = new Long(source.NetAttackAlarmStatus);
        }
        if (source.AutoInclude != null) {
            this.AutoInclude = new Long(source.AutoInclude);
        }
        if (source.CWPScope != null) {
            this.CWPScope = new Long(source.CWPScope);
        }
        if (source.InstanceIDsWithAppId != null) {
            this.InstanceIDsWithAppId = new InstanceIDWithAppIdItem[source.InstanceIDsWithAppId.length];
            for (int i = 0; i < source.InstanceIDsWithAppId.length; i++) {
                this.InstanceIDsWithAppId[i] = new InstanceIDWithAppIdItem(source.InstanceIDsWithAppId[i]);
            }
        }
        if (source.ExcludeInstanceIDsWithAppId != null) {
            this.ExcludeInstanceIDsWithAppId = new InstanceIDWithAppIdItem[source.ExcludeInstanceIDsWithAppId.length];
            for (int i = 0; i < source.ExcludeInstanceIDsWithAppId.length; i++) {
                this.ExcludeInstanceIDsWithAppId[i] = new InstanceIDWithAppIdItem(source.ExcludeInstanceIDsWithAppId[i]);
            }
        }
        if (source.TagIDs != null) {
            this.TagIDs = new String[source.TagIDs.length];
            for (int i = 0; i < source.TagIDs.length; i++) {
                this.TagIDs[i] = new String(source.TagIDs[i]);
            }
        }
        if (source.TCSSScope != null) {
            this.TCSSScope = new Long(source.TCSSScope);
        }
        if (source.ClusterIDsWithAppId != null) {
            this.ClusterIDsWithAppId = new ClusterIDWithAppIdItem[source.ClusterIDsWithAppId.length];
            for (int i = 0; i < source.ClusterIDsWithAppId.length; i++) {
                this.ClusterIDsWithAppId[i] = new ClusterIDWithAppIdItem(source.ClusterIDsWithAppId[i]);
            }
        }
        if (source.ExcludeClusterIDsWithAppId != null) {
            this.ExcludeClusterIDsWithAppId = new ClusterIDWithAppIdItem[source.ExcludeClusterIDsWithAppId.length];
            for (int i = 0; i < source.ExcludeClusterIDsWithAppId.length; i++) {
                this.ExcludeClusterIDsWithAppId[i] = new ClusterIDWithAppIdItem(source.ExcludeClusterIDsWithAppId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NetAttackEnable", this.NetAttackEnable);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "NetAttackAlarmStatus", this.NetAttackAlarmStatus);
        this.setParamSimple(map, prefix + "AutoInclude", this.AutoInclude);
        this.setParamSimple(map, prefix + "CWPScope", this.CWPScope);
        this.setParamArrayObj(map, prefix + "InstanceIDsWithAppId.", this.InstanceIDsWithAppId);
        this.setParamArrayObj(map, prefix + "ExcludeInstanceIDsWithAppId.", this.ExcludeInstanceIDsWithAppId);
        this.setParamArraySimple(map, prefix + "TagIDs.", this.TagIDs);
        this.setParamSimple(map, prefix + "TCSSScope", this.TCSSScope);
        this.setParamArrayObj(map, prefix + "ClusterIDsWithAppId.", this.ClusterIDsWithAppId);
        this.setParamArrayObj(map, prefix + "ExcludeClusterIDsWithAppId.", this.ExcludeClusterIDsWithAppId);

    }
}

