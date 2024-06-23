/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DlcDataGovernPolicy extends AbstractModel {

    /**
    * Data Layout Governance Item
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RewriteDataPolicy")
    @Expose
    private DlcRewriteDataInfo RewriteDataPolicy;

    /**
    * Snapshot Expiration Governance Item
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ExpiredSnapshotsPolicy")
    @Expose
    private DlcExpiredSnapshotsInfo ExpiredSnapshotsPolicy;

    /**
    * Remove Isolated Files Governance Item
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RemoveOrphanFilesPolicy")
    @Expose
    private DlcRemoveOrphanFilesInfo RemoveOrphanFilesPolicy;

    /**
    * Merge Metadata Manifests Governance Item
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("MergeManifestsPolicy")
    @Expose
    private DlcMergeManifestsInfo MergeManifestsPolicy;

    /**
    * Integration Library Rules: default (Default Inheritance), none (No Inheritance)
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("InheritDataBase")
    @Expose
    private String InheritDataBase;

    /**
    * Governance Rule Types, Customize: Custom Definition; Intelligence: Intelligent Governance
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * Governance Engine
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("GovernEngine")
    @Expose
    private String GovernEngine;

    /**
     * Get Data Layout Governance Item
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RewriteDataPolicy Data Layout Governance Item
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public DlcRewriteDataInfo getRewriteDataPolicy() {
        return this.RewriteDataPolicy;
    }

    /**
     * Set Data Layout Governance Item
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RewriteDataPolicy Data Layout Governance Item
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRewriteDataPolicy(DlcRewriteDataInfo RewriteDataPolicy) {
        this.RewriteDataPolicy = RewriteDataPolicy;
    }

    /**
     * Get Snapshot Expiration Governance Item
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ExpiredSnapshotsPolicy Snapshot Expiration Governance Item
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public DlcExpiredSnapshotsInfo getExpiredSnapshotsPolicy() {
        return this.ExpiredSnapshotsPolicy;
    }

    /**
     * Set Snapshot Expiration Governance Item
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ExpiredSnapshotsPolicy Snapshot Expiration Governance Item
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setExpiredSnapshotsPolicy(DlcExpiredSnapshotsInfo ExpiredSnapshotsPolicy) {
        this.ExpiredSnapshotsPolicy = ExpiredSnapshotsPolicy;
    }

    /**
     * Get Remove Isolated Files Governance Item
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RemoveOrphanFilesPolicy Remove Isolated Files Governance Item
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public DlcRemoveOrphanFilesInfo getRemoveOrphanFilesPolicy() {
        return this.RemoveOrphanFilesPolicy;
    }

    /**
     * Set Remove Isolated Files Governance Item
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RemoveOrphanFilesPolicy Remove Isolated Files Governance Item
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRemoveOrphanFilesPolicy(DlcRemoveOrphanFilesInfo RemoveOrphanFilesPolicy) {
        this.RemoveOrphanFilesPolicy = RemoveOrphanFilesPolicy;
    }

    /**
     * Get Merge Metadata Manifests Governance Item
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return MergeManifestsPolicy Merge Metadata Manifests Governance Item
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public DlcMergeManifestsInfo getMergeManifestsPolicy() {
        return this.MergeManifestsPolicy;
    }

    /**
     * Set Merge Metadata Manifests Governance Item
Note: This field may return null, indicating that no valid value can be obtained.
     * @param MergeManifestsPolicy Merge Metadata Manifests Governance Item
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setMergeManifestsPolicy(DlcMergeManifestsInfo MergeManifestsPolicy) {
        this.MergeManifestsPolicy = MergeManifestsPolicy;
    }

    /**
     * Get Integration Library Rules: default (Default Inheritance), none (No Inheritance)
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return InheritDataBase Integration Library Rules: default (Default Inheritance), none (No Inheritance)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getInheritDataBase() {
        return this.InheritDataBase;
    }

    /**
     * Set Integration Library Rules: default (Default Inheritance), none (No Inheritance)
Note: This field may return null, indicating that no valid value can be obtained.
     * @param InheritDataBase Integration Library Rules: default (Default Inheritance), none (No Inheritance)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setInheritDataBase(String InheritDataBase) {
        this.InheritDataBase = InheritDataBase;
    }

    /**
     * Get Governance Rule Types, Customize: Custom Definition; Intelligence: Intelligent Governance
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RuleType Governance Rule Types, Customize: Custom Definition; Intelligence: Intelligent Governance
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set Governance Rule Types, Customize: Custom Definition; Intelligence: Intelligent Governance
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RuleType Governance Rule Types, Customize: Custom Definition; Intelligence: Intelligent Governance
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get Governance Engine
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return GovernEngine Governance Engine
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getGovernEngine() {
        return this.GovernEngine;
    }

    /**
     * Set Governance Engine
Note: This field may return null, indicating that no valid value can be obtained.
     * @param GovernEngine Governance Engine
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setGovernEngine(String GovernEngine) {
        this.GovernEngine = GovernEngine;
    }

    public DlcDataGovernPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DlcDataGovernPolicy(DlcDataGovernPolicy source) {
        if (source.RewriteDataPolicy != null) {
            this.RewriteDataPolicy = new DlcRewriteDataInfo(source.RewriteDataPolicy);
        }
        if (source.ExpiredSnapshotsPolicy != null) {
            this.ExpiredSnapshotsPolicy = new DlcExpiredSnapshotsInfo(source.ExpiredSnapshotsPolicy);
        }
        if (source.RemoveOrphanFilesPolicy != null) {
            this.RemoveOrphanFilesPolicy = new DlcRemoveOrphanFilesInfo(source.RemoveOrphanFilesPolicy);
        }
        if (source.MergeManifestsPolicy != null) {
            this.MergeManifestsPolicy = new DlcMergeManifestsInfo(source.MergeManifestsPolicy);
        }
        if (source.InheritDataBase != null) {
            this.InheritDataBase = new String(source.InheritDataBase);
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.GovernEngine != null) {
            this.GovernEngine = new String(source.GovernEngine);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "RewriteDataPolicy.", this.RewriteDataPolicy);
        this.setParamObj(map, prefix + "ExpiredSnapshotsPolicy.", this.ExpiredSnapshotsPolicy);
        this.setParamObj(map, prefix + "RemoveOrphanFilesPolicy.", this.RemoveOrphanFilesPolicy);
        this.setParamObj(map, prefix + "MergeManifestsPolicy.", this.MergeManifestsPolicy);
        this.setParamSimple(map, prefix + "InheritDataBase", this.InheritDataBase);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "GovernEngine", this.GovernEngine);

    }
}

