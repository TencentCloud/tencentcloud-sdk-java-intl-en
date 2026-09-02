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

public class BaselinePolicy extends AbstractModel {

    /**
    * <p>Periodic scan configuration (switch, interval type, scanning period, etc.).</p>
    */
    @SerializedName("CycleScanConf")
    @Expose
    private CycleScanConf CycleScanConf;

    /**
    * <p>Detect asset major category, case-sensitive host baseline and container cluster baseline. Parameter values:</p><ul><li>HOST: Host</li><li>CLUSTER: Container cluster</li></ul>
    */
    @SerializedName("CheckAssetType")
    @Expose
    private String CheckAssetType;

    /**
    * <p>Whether to automatically join this policy when new built-in detection items are added to the system. true: automatically join, false: do not join.</p>
    */
    @SerializedName("AutoSyncItem")
    @Expose
    private Boolean AutoSyncItem;

    /**
    * <p>Baseline policy type. Values:</p><ul><li>SYSTEM: system policy (CSIP built-in)</li><li>SELF: user-defined policy</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Policy Name (custom policy is user input, and system policy is a built-in classification name).</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Policy description.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Host effective scope. Value:</p><ul><li>ALL: all hosts (can be used in conjunction with ConfHostExcludeList for removal)</li><li>TAG_MATCH: tag matching, in conjunction with ConfHostTagValue</li><li>PICK: takes effect only on hosts specified in ConfHostIncludeList</li><li>NONE: no configuration</li></ul>
    */
    @SerializedName("ConfHostType")
    @Expose
    private String ConfHostType;

    /**
    * <p>Host InstanceID allowlist, used when ConfHostType=PICK / TAG_MATCH.</p>
    */
    @SerializedName("ConfHostIncludeList")
    @Expose
    private String [] ConfHostIncludeList;

    /**
    * <p>Host InstanceID removal list, used when ConfHostType=ALL.</p>
    */
    @SerializedName("ConfHostExcludeList")
    @Expose
    private String [] ConfHostExcludeList;

    /**
    * <p>Policy activation status. 0 disabled, 1 enabled; once disabled, the policy will not participate in scans and statistics.</p>
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * <p>Cluster effective scope. Value:</p><ul><li>ALL: all clusters (can be used in conjunction with ConfClusterExcludeList for removal)</li><li>PICK: takes effect only on the clusters specified by ConfClusterIncludeList</li><li>NONE: no configuration</li></ul>
    */
    @SerializedName("ConfClusterType")
    @Expose
    private String ConfClusterType;

    /**
    * <p>Cluster ID allowlist, used when ConfClusterType=PICK.</p>
    */
    @SerializedName("ConfClusterIncludeList")
    @Expose
    private String [] ConfClusterIncludeList;

    /**
    * <p>Cluster ID removal list, used when ConfClusterType=ALL.</p>
    */
    @SerializedName("ConfClusterExcludeList")
    @Expose
    private String [] ConfClusterExcludeList;

    /**
    * <p>Hit configuration of system classification / subcategory / detection item (only system policies take effect).</p>
    */
    @SerializedName("CategoryConf")
    @Expose
    private BaselinePolicySystemCategoryConf [] CategoryConf;

    /**
    * <p>Custom detection item parameter value configuration list (overwrites the judgment value based on the system check item).</p>
    */
    @SerializedName("CustomItemConf")
    @Expose
    private BaselineCustomItemConf [] CustomItemConf;

    /**
    * <p>Appid of the associated tenant of the policy.</p>
    */
    @SerializedName("Appid")
    @Expose
    private Long Appid;

    /**
    * <p>Baseline policy ID.</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>Number of detection items configured in the current policy.</p>
    */
    @SerializedName("ConfItemCount")
    @Expose
    private Long ConfItemCount;

    /**
    * <p>Number of hosts hit by the current policy.</p>
    */
    @SerializedName("ConfHostCount")
    @Expose
    private Long ConfHostCount;

    /**
    * <p>Number of clusters hit by the current policy.</p>
    */
    @SerializedName("ConfClusterCount")
    @Expose
    private Long ConfClusterCount;

    /**
    * <p>ID of the scan main task currently in progress for the policy; 0 if not in a scan.</p>
    */
    @SerializedName("ScanningTaskID")
    @Expose
    private Long ScanningTaskID;

    /**
    * <p>Last scan completion time (including manual/periodic).</p>
    */
    @SerializedName("LatestScanTime")
    @Expose
    private String LatestScanTime;

    /**
    * <p>Last periodic scan completion time.</p>
    */
    @SerializedName("LatestCycleScanTime")
    @Expose
    private String LatestCycleScanTime;

    /**
    * <p>Security Center tag ID list</p>
    */
    @SerializedName("TagIDList")
    @Expose
    private Long [] TagIDList;

    /**
    * <p>Cloud tag list</p>
    */
    @SerializedName("CloudTagList")
    @Expose
    private String [] CloudTagList;

    /**
     * Get <p>Periodic scan configuration (switch, interval type, scanning period, etc.).</p> 
     * @return CycleScanConf <p>Periodic scan configuration (switch, interval type, scanning period, etc.).</p>
     */
    public CycleScanConf getCycleScanConf() {
        return this.CycleScanConf;
    }

    /**
     * Set <p>Periodic scan configuration (switch, interval type, scanning period, etc.).</p>
     * @param CycleScanConf <p>Periodic scan configuration (switch, interval type, scanning period, etc.).</p>
     */
    public void setCycleScanConf(CycleScanConf CycleScanConf) {
        this.CycleScanConf = CycleScanConf;
    }

    /**
     * Get <p>Detect asset major category, case-sensitive host baseline and container cluster baseline. Parameter values:</p><ul><li>HOST: Host</li><li>CLUSTER: Container cluster</li></ul> 
     * @return CheckAssetType <p>Detect asset major category, case-sensitive host baseline and container cluster baseline. Parameter values:</p><ul><li>HOST: Host</li><li>CLUSTER: Container cluster</li></ul>
     */
    public String getCheckAssetType() {
        return this.CheckAssetType;
    }

    /**
     * Set <p>Detect asset major category, case-sensitive host baseline and container cluster baseline. Parameter values:</p><ul><li>HOST: Host</li><li>CLUSTER: Container cluster</li></ul>
     * @param CheckAssetType <p>Detect asset major category, case-sensitive host baseline and container cluster baseline. Parameter values:</p><ul><li>HOST: Host</li><li>CLUSTER: Container cluster</li></ul>
     */
    public void setCheckAssetType(String CheckAssetType) {
        this.CheckAssetType = CheckAssetType;
    }

    /**
     * Get <p>Whether to automatically join this policy when new built-in detection items are added to the system. true: automatically join, false: do not join.</p> 
     * @return AutoSyncItem <p>Whether to automatically join this policy when new built-in detection items are added to the system. true: automatically join, false: do not join.</p>
     */
    public Boolean getAutoSyncItem() {
        return this.AutoSyncItem;
    }

    /**
     * Set <p>Whether to automatically join this policy when new built-in detection items are added to the system. true: automatically join, false: do not join.</p>
     * @param AutoSyncItem <p>Whether to automatically join this policy when new built-in detection items are added to the system. true: automatically join, false: do not join.</p>
     */
    public void setAutoSyncItem(Boolean AutoSyncItem) {
        this.AutoSyncItem = AutoSyncItem;
    }

    /**
     * Get <p>Baseline policy type. Values:</p><ul><li>SYSTEM: system policy (CSIP built-in)</li><li>SELF: user-defined policy</li></ul> 
     * @return Type <p>Baseline policy type. Values:</p><ul><li>SYSTEM: system policy (CSIP built-in)</li><li>SELF: user-defined policy</li></ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Baseline policy type. Values:</p><ul><li>SYSTEM: system policy (CSIP built-in)</li><li>SELF: user-defined policy</li></ul>
     * @param Type <p>Baseline policy type. Values:</p><ul><li>SYSTEM: system policy (CSIP built-in)</li><li>SELF: user-defined policy</li></ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Policy Name (custom policy is user input, and system policy is a built-in classification name).</p> 
     * @return Name <p>Policy Name (custom policy is user input, and system policy is a built-in classification name).</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Policy Name (custom policy is user input, and system policy is a built-in classification name).</p>
     * @param Name <p>Policy Name (custom policy is user input, and system policy is a built-in classification name).</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Policy description.</p> 
     * @return Description <p>Policy description.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Policy description.</p>
     * @param Description <p>Policy description.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Host effective scope. Value:</p><ul><li>ALL: all hosts (can be used in conjunction with ConfHostExcludeList for removal)</li><li>TAG_MATCH: tag matching, in conjunction with ConfHostTagValue</li><li>PICK: takes effect only on hosts specified in ConfHostIncludeList</li><li>NONE: no configuration</li></ul> 
     * @return ConfHostType <p>Host effective scope. Value:</p><ul><li>ALL: all hosts (can be used in conjunction with ConfHostExcludeList for removal)</li><li>TAG_MATCH: tag matching, in conjunction with ConfHostTagValue</li><li>PICK: takes effect only on hosts specified in ConfHostIncludeList</li><li>NONE: no configuration</li></ul>
     */
    public String getConfHostType() {
        return this.ConfHostType;
    }

    /**
     * Set <p>Host effective scope. Value:</p><ul><li>ALL: all hosts (can be used in conjunction with ConfHostExcludeList for removal)</li><li>TAG_MATCH: tag matching, in conjunction with ConfHostTagValue</li><li>PICK: takes effect only on hosts specified in ConfHostIncludeList</li><li>NONE: no configuration</li></ul>
     * @param ConfHostType <p>Host effective scope. Value:</p><ul><li>ALL: all hosts (can be used in conjunction with ConfHostExcludeList for removal)</li><li>TAG_MATCH: tag matching, in conjunction with ConfHostTagValue</li><li>PICK: takes effect only on hosts specified in ConfHostIncludeList</li><li>NONE: no configuration</li></ul>
     */
    public void setConfHostType(String ConfHostType) {
        this.ConfHostType = ConfHostType;
    }

    /**
     * Get <p>Host InstanceID allowlist, used when ConfHostType=PICK / TAG_MATCH.</p> 
     * @return ConfHostIncludeList <p>Host InstanceID allowlist, used when ConfHostType=PICK / TAG_MATCH.</p>
     */
    public String [] getConfHostIncludeList() {
        return this.ConfHostIncludeList;
    }

    /**
     * Set <p>Host InstanceID allowlist, used when ConfHostType=PICK / TAG_MATCH.</p>
     * @param ConfHostIncludeList <p>Host InstanceID allowlist, used when ConfHostType=PICK / TAG_MATCH.</p>
     */
    public void setConfHostIncludeList(String [] ConfHostIncludeList) {
        this.ConfHostIncludeList = ConfHostIncludeList;
    }

    /**
     * Get <p>Host InstanceID removal list, used when ConfHostType=ALL.</p> 
     * @return ConfHostExcludeList <p>Host InstanceID removal list, used when ConfHostType=ALL.</p>
     */
    public String [] getConfHostExcludeList() {
        return this.ConfHostExcludeList;
    }

    /**
     * Set <p>Host InstanceID removal list, used when ConfHostType=ALL.</p>
     * @param ConfHostExcludeList <p>Host InstanceID removal list, used when ConfHostType=ALL.</p>
     */
    public void setConfHostExcludeList(String [] ConfHostExcludeList) {
        this.ConfHostExcludeList = ConfHostExcludeList;
    }

    /**
     * Get <p>Policy activation status. 0 disabled, 1 enabled; once disabled, the policy will not participate in scans and statistics.</p> 
     * @return Enable <p>Policy activation status. 0 disabled, 1 enabled; once disabled, the policy will not participate in scans and statistics.</p>
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>Policy activation status. 0 disabled, 1 enabled; once disabled, the policy will not participate in scans and statistics.</p>
     * @param Enable <p>Policy activation status. 0 disabled, 1 enabled; once disabled, the policy will not participate in scans and statistics.</p>
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>Cluster effective scope. Value:</p><ul><li>ALL: all clusters (can be used in conjunction with ConfClusterExcludeList for removal)</li><li>PICK: takes effect only on the clusters specified by ConfClusterIncludeList</li><li>NONE: no configuration</li></ul> 
     * @return ConfClusterType <p>Cluster effective scope. Value:</p><ul><li>ALL: all clusters (can be used in conjunction with ConfClusterExcludeList for removal)</li><li>PICK: takes effect only on the clusters specified by ConfClusterIncludeList</li><li>NONE: no configuration</li></ul>
     */
    public String getConfClusterType() {
        return this.ConfClusterType;
    }

    /**
     * Set <p>Cluster effective scope. Value:</p><ul><li>ALL: all clusters (can be used in conjunction with ConfClusterExcludeList for removal)</li><li>PICK: takes effect only on the clusters specified by ConfClusterIncludeList</li><li>NONE: no configuration</li></ul>
     * @param ConfClusterType <p>Cluster effective scope. Value:</p><ul><li>ALL: all clusters (can be used in conjunction with ConfClusterExcludeList for removal)</li><li>PICK: takes effect only on the clusters specified by ConfClusterIncludeList</li><li>NONE: no configuration</li></ul>
     */
    public void setConfClusterType(String ConfClusterType) {
        this.ConfClusterType = ConfClusterType;
    }

    /**
     * Get <p>Cluster ID allowlist, used when ConfClusterType=PICK.</p> 
     * @return ConfClusterIncludeList <p>Cluster ID allowlist, used when ConfClusterType=PICK.</p>
     */
    public String [] getConfClusterIncludeList() {
        return this.ConfClusterIncludeList;
    }

    /**
     * Set <p>Cluster ID allowlist, used when ConfClusterType=PICK.</p>
     * @param ConfClusterIncludeList <p>Cluster ID allowlist, used when ConfClusterType=PICK.</p>
     */
    public void setConfClusterIncludeList(String [] ConfClusterIncludeList) {
        this.ConfClusterIncludeList = ConfClusterIncludeList;
    }

    /**
     * Get <p>Cluster ID removal list, used when ConfClusterType=ALL.</p> 
     * @return ConfClusterExcludeList <p>Cluster ID removal list, used when ConfClusterType=ALL.</p>
     */
    public String [] getConfClusterExcludeList() {
        return this.ConfClusterExcludeList;
    }

    /**
     * Set <p>Cluster ID removal list, used when ConfClusterType=ALL.</p>
     * @param ConfClusterExcludeList <p>Cluster ID removal list, used when ConfClusterType=ALL.</p>
     */
    public void setConfClusterExcludeList(String [] ConfClusterExcludeList) {
        this.ConfClusterExcludeList = ConfClusterExcludeList;
    }

    /**
     * Get <p>Hit configuration of system classification / subcategory / detection item (only system policies take effect).</p> 
     * @return CategoryConf <p>Hit configuration of system classification / subcategory / detection item (only system policies take effect).</p>
     */
    public BaselinePolicySystemCategoryConf [] getCategoryConf() {
        return this.CategoryConf;
    }

    /**
     * Set <p>Hit configuration of system classification / subcategory / detection item (only system policies take effect).</p>
     * @param CategoryConf <p>Hit configuration of system classification / subcategory / detection item (only system policies take effect).</p>
     */
    public void setCategoryConf(BaselinePolicySystemCategoryConf [] CategoryConf) {
        this.CategoryConf = CategoryConf;
    }

    /**
     * Get <p>Custom detection item parameter value configuration list (overwrites the judgment value based on the system check item).</p> 
     * @return CustomItemConf <p>Custom detection item parameter value configuration list (overwrites the judgment value based on the system check item).</p>
     */
    public BaselineCustomItemConf [] getCustomItemConf() {
        return this.CustomItemConf;
    }

    /**
     * Set <p>Custom detection item parameter value configuration list (overwrites the judgment value based on the system check item).</p>
     * @param CustomItemConf <p>Custom detection item parameter value configuration list (overwrites the judgment value based on the system check item).</p>
     */
    public void setCustomItemConf(BaselineCustomItemConf [] CustomItemConf) {
        this.CustomItemConf = CustomItemConf;
    }

    /**
     * Get <p>Appid of the associated tenant of the policy.</p> 
     * @return Appid <p>Appid of the associated tenant of the policy.</p>
     */
    public Long getAppid() {
        return this.Appid;
    }

    /**
     * Set <p>Appid of the associated tenant of the policy.</p>
     * @param Appid <p>Appid of the associated tenant of the policy.</p>
     */
    public void setAppid(Long Appid) {
        this.Appid = Appid;
    }

    /**
     * Get <p>Baseline policy ID.</p> 
     * @return ID <p>Baseline policy ID.</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>Baseline policy ID.</p>
     * @param ID <p>Baseline policy ID.</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>Number of detection items configured in the current policy.</p> 
     * @return ConfItemCount <p>Number of detection items configured in the current policy.</p>
     */
    public Long getConfItemCount() {
        return this.ConfItemCount;
    }

    /**
     * Set <p>Number of detection items configured in the current policy.</p>
     * @param ConfItemCount <p>Number of detection items configured in the current policy.</p>
     */
    public void setConfItemCount(Long ConfItemCount) {
        this.ConfItemCount = ConfItemCount;
    }

    /**
     * Get <p>Number of hosts hit by the current policy.</p> 
     * @return ConfHostCount <p>Number of hosts hit by the current policy.</p>
     */
    public Long getConfHostCount() {
        return this.ConfHostCount;
    }

    /**
     * Set <p>Number of hosts hit by the current policy.</p>
     * @param ConfHostCount <p>Number of hosts hit by the current policy.</p>
     */
    public void setConfHostCount(Long ConfHostCount) {
        this.ConfHostCount = ConfHostCount;
    }

    /**
     * Get <p>Number of clusters hit by the current policy.</p> 
     * @return ConfClusterCount <p>Number of clusters hit by the current policy.</p>
     */
    public Long getConfClusterCount() {
        return this.ConfClusterCount;
    }

    /**
     * Set <p>Number of clusters hit by the current policy.</p>
     * @param ConfClusterCount <p>Number of clusters hit by the current policy.</p>
     */
    public void setConfClusterCount(Long ConfClusterCount) {
        this.ConfClusterCount = ConfClusterCount;
    }

    /**
     * Get <p>ID of the scan main task currently in progress for the policy; 0 if not in a scan.</p> 
     * @return ScanningTaskID <p>ID of the scan main task currently in progress for the policy; 0 if not in a scan.</p>
     */
    public Long getScanningTaskID() {
        return this.ScanningTaskID;
    }

    /**
     * Set <p>ID of the scan main task currently in progress for the policy; 0 if not in a scan.</p>
     * @param ScanningTaskID <p>ID of the scan main task currently in progress for the policy; 0 if not in a scan.</p>
     */
    public void setScanningTaskID(Long ScanningTaskID) {
        this.ScanningTaskID = ScanningTaskID;
    }

    /**
     * Get <p>Last scan completion time (including manual/periodic).</p> 
     * @return LatestScanTime <p>Last scan completion time (including manual/periodic).</p>
     */
    public String getLatestScanTime() {
        return this.LatestScanTime;
    }

    /**
     * Set <p>Last scan completion time (including manual/periodic).</p>
     * @param LatestScanTime <p>Last scan completion time (including manual/periodic).</p>
     */
    public void setLatestScanTime(String LatestScanTime) {
        this.LatestScanTime = LatestScanTime;
    }

    /**
     * Get <p>Last periodic scan completion time.</p> 
     * @return LatestCycleScanTime <p>Last periodic scan completion time.</p>
     */
    public String getLatestCycleScanTime() {
        return this.LatestCycleScanTime;
    }

    /**
     * Set <p>Last periodic scan completion time.</p>
     * @param LatestCycleScanTime <p>Last periodic scan completion time.</p>
     */
    public void setLatestCycleScanTime(String LatestCycleScanTime) {
        this.LatestCycleScanTime = LatestCycleScanTime;
    }

    /**
     * Get <p>Security Center tag ID list</p> 
     * @return TagIDList <p>Security Center tag ID list</p>
     */
    public Long [] getTagIDList() {
        return this.TagIDList;
    }

    /**
     * Set <p>Security Center tag ID list</p>
     * @param TagIDList <p>Security Center tag ID list</p>
     */
    public void setTagIDList(Long [] TagIDList) {
        this.TagIDList = TagIDList;
    }

    /**
     * Get <p>Cloud tag list</p> 
     * @return CloudTagList <p>Cloud tag list</p>
     */
    public String [] getCloudTagList() {
        return this.CloudTagList;
    }

    /**
     * Set <p>Cloud tag list</p>
     * @param CloudTagList <p>Cloud tag list</p>
     */
    public void setCloudTagList(String [] CloudTagList) {
        this.CloudTagList = CloudTagList;
    }

    public BaselinePolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselinePolicy(BaselinePolicy source) {
        if (source.CycleScanConf != null) {
            this.CycleScanConf = new CycleScanConf(source.CycleScanConf);
        }
        if (source.CheckAssetType != null) {
            this.CheckAssetType = new String(source.CheckAssetType);
        }
        if (source.AutoSyncItem != null) {
            this.AutoSyncItem = new Boolean(source.AutoSyncItem);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ConfHostType != null) {
            this.ConfHostType = new String(source.ConfHostType);
        }
        if (source.ConfHostIncludeList != null) {
            this.ConfHostIncludeList = new String[source.ConfHostIncludeList.length];
            for (int i = 0; i < source.ConfHostIncludeList.length; i++) {
                this.ConfHostIncludeList[i] = new String(source.ConfHostIncludeList[i]);
            }
        }
        if (source.ConfHostExcludeList != null) {
            this.ConfHostExcludeList = new String[source.ConfHostExcludeList.length];
            for (int i = 0; i < source.ConfHostExcludeList.length; i++) {
                this.ConfHostExcludeList[i] = new String(source.ConfHostExcludeList[i]);
            }
        }
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.ConfClusterType != null) {
            this.ConfClusterType = new String(source.ConfClusterType);
        }
        if (source.ConfClusterIncludeList != null) {
            this.ConfClusterIncludeList = new String[source.ConfClusterIncludeList.length];
            for (int i = 0; i < source.ConfClusterIncludeList.length; i++) {
                this.ConfClusterIncludeList[i] = new String(source.ConfClusterIncludeList[i]);
            }
        }
        if (source.ConfClusterExcludeList != null) {
            this.ConfClusterExcludeList = new String[source.ConfClusterExcludeList.length];
            for (int i = 0; i < source.ConfClusterExcludeList.length; i++) {
                this.ConfClusterExcludeList[i] = new String(source.ConfClusterExcludeList[i]);
            }
        }
        if (source.CategoryConf != null) {
            this.CategoryConf = new BaselinePolicySystemCategoryConf[source.CategoryConf.length];
            for (int i = 0; i < source.CategoryConf.length; i++) {
                this.CategoryConf[i] = new BaselinePolicySystemCategoryConf(source.CategoryConf[i]);
            }
        }
        if (source.CustomItemConf != null) {
            this.CustomItemConf = new BaselineCustomItemConf[source.CustomItemConf.length];
            for (int i = 0; i < source.CustomItemConf.length; i++) {
                this.CustomItemConf[i] = new BaselineCustomItemConf(source.CustomItemConf[i]);
            }
        }
        if (source.Appid != null) {
            this.Appid = new Long(source.Appid);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.ConfItemCount != null) {
            this.ConfItemCount = new Long(source.ConfItemCount);
        }
        if (source.ConfHostCount != null) {
            this.ConfHostCount = new Long(source.ConfHostCount);
        }
        if (source.ConfClusterCount != null) {
            this.ConfClusterCount = new Long(source.ConfClusterCount);
        }
        if (source.ScanningTaskID != null) {
            this.ScanningTaskID = new Long(source.ScanningTaskID);
        }
        if (source.LatestScanTime != null) {
            this.LatestScanTime = new String(source.LatestScanTime);
        }
        if (source.LatestCycleScanTime != null) {
            this.LatestCycleScanTime = new String(source.LatestCycleScanTime);
        }
        if (source.TagIDList != null) {
            this.TagIDList = new Long[source.TagIDList.length];
            for (int i = 0; i < source.TagIDList.length; i++) {
                this.TagIDList[i] = new Long(source.TagIDList[i]);
            }
        }
        if (source.CloudTagList != null) {
            this.CloudTagList = new String[source.CloudTagList.length];
            for (int i = 0; i < source.CloudTagList.length; i++) {
                this.CloudTagList[i] = new String(source.CloudTagList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "CycleScanConf.", this.CycleScanConf);
        this.setParamSimple(map, prefix + "CheckAssetType", this.CheckAssetType);
        this.setParamSimple(map, prefix + "AutoSyncItem", this.AutoSyncItem);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ConfHostType", this.ConfHostType);
        this.setParamArraySimple(map, prefix + "ConfHostIncludeList.", this.ConfHostIncludeList);
        this.setParamArraySimple(map, prefix + "ConfHostExcludeList.", this.ConfHostExcludeList);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "ConfClusterType", this.ConfClusterType);
        this.setParamArraySimple(map, prefix + "ConfClusterIncludeList.", this.ConfClusterIncludeList);
        this.setParamArraySimple(map, prefix + "ConfClusterExcludeList.", this.ConfClusterExcludeList);
        this.setParamArrayObj(map, prefix + "CategoryConf.", this.CategoryConf);
        this.setParamArrayObj(map, prefix + "CustomItemConf.", this.CustomItemConf);
        this.setParamSimple(map, prefix + "Appid", this.Appid);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "ConfItemCount", this.ConfItemCount);
        this.setParamSimple(map, prefix + "ConfHostCount", this.ConfHostCount);
        this.setParamSimple(map, prefix + "ConfClusterCount", this.ConfClusterCount);
        this.setParamSimple(map, prefix + "ScanningTaskID", this.ScanningTaskID);
        this.setParamSimple(map, prefix + "LatestScanTime", this.LatestScanTime);
        this.setParamSimple(map, prefix + "LatestCycleScanTime", this.LatestCycleScanTime);
        this.setParamArraySimple(map, prefix + "TagIDList.", this.TagIDList);
        this.setParamArraySimple(map, prefix + "CloudTagList.", this.CloudTagList);

    }
}

