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

public class ModifyAILinkSettingRequest extends AbstractModel {

    /**
    * <p>0: Turn off the AI-Link engine, 1: Turn on the AI-Link engine</p>
    */
    @SerializedName("AILinkEnable")
    @Expose
    private Long AILinkEnable;

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Deep mode 0-Off 1-On</p>
    */
    @SerializedName("RuleScopeDeep")
    @Expose
    private Long RuleScopeDeep;

    /**
    * <p>Balanced mode. 0: off; 1: on</p>
    */
    @SerializedName("RuleScopeBalanced")
    @Expose
    private Long RuleScopeBalanced;

    /**
    * <p>Precision mode 0-Disable 1-Enable</p>
    */
    @SerializedName("RuleScopePrecise")
    @Expose
    private Long RuleScopePrecise;

    /**
    * <p>1 for all professional/flagship edition hosts, 0 for the selected host list</p>
    */
    @SerializedName("Scope")
    @Expose
    private Long Scope;

    /**
    * <p>Selected host Quuid list (required when Scope=0)</p>
    */
    @SerializedName("Quuids")
    @Expose
    private String [] Quuids;

    /**
    * <p>Exclusion host Quuid list (this parameter is valid only when Scope=1)</p>
    */
    @SerializedName("ExcludeQuuids")
    @Expose
    private String [] ExcludeQuuids;

    /**
    * <p>Automatic inclusion of new assets: 0 excludes, 1 includes</p>
    */
    @SerializedName("AutoInclude")
    @Expose
    private Long AutoInclude;

    /**
    * <p>Tag ID</p>
    */
    @SerializedName("TagIDs")
    @Expose
    private String [] TagIDs;

    /**
    * <p>0,1</p><p>Enumeration values:</p><ul><li>0: Partial</li><li>1: All</li></ul>
    */
    @SerializedName("TCSSScope")
    @Expose
    private Long TCSSScope;

    /**
    * <p>Cluster ID.</p>
    */
    @SerializedName("ClusterIDs")
    @Expose
    private String [] ClusterIDs;

    /**
    * <p>Exclude Cluster ID</p>
    */
    @SerializedName("ExcludeClusterIDs")
    @Expose
    private String [] ExcludeClusterIDs;

    /**
    * <p>Instance ID.</p>
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * <p>Instance ID exclusion</p>
    */
    @SerializedName("ExcludeInstanceIds")
    @Expose
    private String [] ExcludeInstanceIds;

    /**
     * Get <p>0: Turn off the AI-Link engine, 1: Turn on the AI-Link engine</p> 
     * @return AILinkEnable <p>0: Turn off the AI-Link engine, 1: Turn on the AI-Link engine</p>
     */
    public Long getAILinkEnable() {
        return this.AILinkEnable;
    }

    /**
     * Set <p>0: Turn off the AI-Link engine, 1: Turn on the AI-Link engine</p>
     * @param AILinkEnable <p>0: Turn off the AI-Link engine, 1: Turn on the AI-Link engine</p>
     */
    public void setAILinkEnable(Long AILinkEnable) {
        this.AILinkEnable = AILinkEnable;
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
     * Get <p>Deep mode 0-Off 1-On</p> 
     * @return RuleScopeDeep <p>Deep mode 0-Off 1-On</p>
     */
    public Long getRuleScopeDeep() {
        return this.RuleScopeDeep;
    }

    /**
     * Set <p>Deep mode 0-Off 1-On</p>
     * @param RuleScopeDeep <p>Deep mode 0-Off 1-On</p>
     */
    public void setRuleScopeDeep(Long RuleScopeDeep) {
        this.RuleScopeDeep = RuleScopeDeep;
    }

    /**
     * Get <p>Balanced mode. 0: off; 1: on</p> 
     * @return RuleScopeBalanced <p>Balanced mode. 0: off; 1: on</p>
     */
    public Long getRuleScopeBalanced() {
        return this.RuleScopeBalanced;
    }

    /**
     * Set <p>Balanced mode. 0: off; 1: on</p>
     * @param RuleScopeBalanced <p>Balanced mode. 0: off; 1: on</p>
     */
    public void setRuleScopeBalanced(Long RuleScopeBalanced) {
        this.RuleScopeBalanced = RuleScopeBalanced;
    }

    /**
     * Get <p>Precision mode 0-Disable 1-Enable</p> 
     * @return RuleScopePrecise <p>Precision mode 0-Disable 1-Enable</p>
     */
    public Long getRuleScopePrecise() {
        return this.RuleScopePrecise;
    }

    /**
     * Set <p>Precision mode 0-Disable 1-Enable</p>
     * @param RuleScopePrecise <p>Precision mode 0-Disable 1-Enable</p>
     */
    public void setRuleScopePrecise(Long RuleScopePrecise) {
        this.RuleScopePrecise = RuleScopePrecise;
    }

    /**
     * Get <p>1 for all professional/flagship edition hosts, 0 for the selected host list</p> 
     * @return Scope <p>1 for all professional/flagship edition hosts, 0 for the selected host list</p>
     */
    public Long getScope() {
        return this.Scope;
    }

    /**
     * Set <p>1 for all professional/flagship edition hosts, 0 for the selected host list</p>
     * @param Scope <p>1 for all professional/flagship edition hosts, 0 for the selected host list</p>
     */
    public void setScope(Long Scope) {
        this.Scope = Scope;
    }

    /**
     * Get <p>Selected host Quuid list (required when Scope=0)</p> 
     * @return Quuids <p>Selected host Quuid list (required when Scope=0)</p>
     * @deprecated
     */
    @Deprecated
    public String [] getQuuids() {
        return this.Quuids;
    }

    /**
     * Set <p>Selected host Quuid list (required when Scope=0)</p>
     * @param Quuids <p>Selected host Quuid list (required when Scope=0)</p>
     * @deprecated
     */
    @Deprecated
    public void setQuuids(String [] Quuids) {
        this.Quuids = Quuids;
    }

    /**
     * Get <p>Exclusion host Quuid list (this parameter is valid only when Scope=1)</p> 
     * @return ExcludeQuuids <p>Exclusion host Quuid list (this parameter is valid only when Scope=1)</p>
     * @deprecated
     */
    @Deprecated
    public String [] getExcludeQuuids() {
        return this.ExcludeQuuids;
    }

    /**
     * Set <p>Exclusion host Quuid list (this parameter is valid only when Scope=1)</p>
     * @param ExcludeQuuids <p>Exclusion host Quuid list (this parameter is valid only when Scope=1)</p>
     * @deprecated
     */
    @Deprecated
    public void setExcludeQuuids(String [] ExcludeQuuids) {
        this.ExcludeQuuids = ExcludeQuuids;
    }

    /**
     * Get <p>Automatic inclusion of new assets: 0 excludes, 1 includes</p> 
     * @return AutoInclude <p>Automatic inclusion of new assets: 0 excludes, 1 includes</p>
     */
    public Long getAutoInclude() {
        return this.AutoInclude;
    }

    /**
     * Set <p>Automatic inclusion of new assets: 0 excludes, 1 includes</p>
     * @param AutoInclude <p>Automatic inclusion of new assets: 0 excludes, 1 includes</p>
     */
    public void setAutoInclude(Long AutoInclude) {
        this.AutoInclude = AutoInclude;
    }

    /**
     * Get <p>Tag ID</p> 
     * @return TagIDs <p>Tag ID</p>
     */
    public String [] getTagIDs() {
        return this.TagIDs;
    }

    /**
     * Set <p>Tag ID</p>
     * @param TagIDs <p>Tag ID</p>
     */
    public void setTagIDs(String [] TagIDs) {
        this.TagIDs = TagIDs;
    }

    /**
     * Get <p>0,1</p><p>Enumeration values:</p><ul><li>0: Partial</li><li>1: All</li></ul> 
     * @return TCSSScope <p>0,1</p><p>Enumeration values:</p><ul><li>0: Partial</li><li>1: All</li></ul>
     */
    public Long getTCSSScope() {
        return this.TCSSScope;
    }

    /**
     * Set <p>0,1</p><p>Enumeration values:</p><ul><li>0: Partial</li><li>1: All</li></ul>
     * @param TCSSScope <p>0,1</p><p>Enumeration values:</p><ul><li>0: Partial</li><li>1: All</li></ul>
     */
    public void setTCSSScope(Long TCSSScope) {
        this.TCSSScope = TCSSScope;
    }

    /**
     * Get <p>Cluster ID.</p> 
     * @return ClusterIDs <p>Cluster ID.</p>
     */
    public String [] getClusterIDs() {
        return this.ClusterIDs;
    }

    /**
     * Set <p>Cluster ID.</p>
     * @param ClusterIDs <p>Cluster ID.</p>
     */
    public void setClusterIDs(String [] ClusterIDs) {
        this.ClusterIDs = ClusterIDs;
    }

    /**
     * Get <p>Exclude Cluster ID</p> 
     * @return ExcludeClusterIDs <p>Exclude Cluster ID</p>
     */
    public String [] getExcludeClusterIDs() {
        return this.ExcludeClusterIDs;
    }

    /**
     * Set <p>Exclude Cluster ID</p>
     * @param ExcludeClusterIDs <p>Exclude Cluster ID</p>
     */
    public void setExcludeClusterIDs(String [] ExcludeClusterIDs) {
        this.ExcludeClusterIDs = ExcludeClusterIDs;
    }

    /**
     * Get <p>Instance ID.</p> 
     * @return InstanceIds <p>Instance ID.</p>
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set <p>Instance ID.</p>
     * @param InstanceIds <p>Instance ID.</p>
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get <p>Instance ID exclusion</p> 
     * @return ExcludeInstanceIds <p>Instance ID exclusion</p>
     */
    public String [] getExcludeInstanceIds() {
        return this.ExcludeInstanceIds;
    }

    /**
     * Set <p>Instance ID exclusion</p>
     * @param ExcludeInstanceIds <p>Instance ID exclusion</p>
     */
    public void setExcludeInstanceIds(String [] ExcludeInstanceIds) {
        this.ExcludeInstanceIds = ExcludeInstanceIds;
    }

    public ModifyAILinkSettingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAILinkSettingRequest(ModifyAILinkSettingRequest source) {
        if (source.AILinkEnable != null) {
            this.AILinkEnable = new Long(source.AILinkEnable);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.RuleScopeDeep != null) {
            this.RuleScopeDeep = new Long(source.RuleScopeDeep);
        }
        if (source.RuleScopeBalanced != null) {
            this.RuleScopeBalanced = new Long(source.RuleScopeBalanced);
        }
        if (source.RuleScopePrecise != null) {
            this.RuleScopePrecise = new Long(source.RuleScopePrecise);
        }
        if (source.Scope != null) {
            this.Scope = new Long(source.Scope);
        }
        if (source.Quuids != null) {
            this.Quuids = new String[source.Quuids.length];
            for (int i = 0; i < source.Quuids.length; i++) {
                this.Quuids[i] = new String(source.Quuids[i]);
            }
        }
        if (source.ExcludeQuuids != null) {
            this.ExcludeQuuids = new String[source.ExcludeQuuids.length];
            for (int i = 0; i < source.ExcludeQuuids.length; i++) {
                this.ExcludeQuuids[i] = new String(source.ExcludeQuuids[i]);
            }
        }
        if (source.AutoInclude != null) {
            this.AutoInclude = new Long(source.AutoInclude);
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
        if (source.ClusterIDs != null) {
            this.ClusterIDs = new String[source.ClusterIDs.length];
            for (int i = 0; i < source.ClusterIDs.length; i++) {
                this.ClusterIDs[i] = new String(source.ClusterIDs[i]);
            }
        }
        if (source.ExcludeClusterIDs != null) {
            this.ExcludeClusterIDs = new String[source.ExcludeClusterIDs.length];
            for (int i = 0; i < source.ExcludeClusterIDs.length; i++) {
                this.ExcludeClusterIDs[i] = new String(source.ExcludeClusterIDs[i]);
            }
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.ExcludeInstanceIds != null) {
            this.ExcludeInstanceIds = new String[source.ExcludeInstanceIds.length];
            for (int i = 0; i < source.ExcludeInstanceIds.length; i++) {
                this.ExcludeInstanceIds[i] = new String(source.ExcludeInstanceIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AILinkEnable", this.AILinkEnable);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "RuleScopeDeep", this.RuleScopeDeep);
        this.setParamSimple(map, prefix + "RuleScopeBalanced", this.RuleScopeBalanced);
        this.setParamSimple(map, prefix + "RuleScopePrecise", this.RuleScopePrecise);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamArraySimple(map, prefix + "Quuids.", this.Quuids);
        this.setParamArraySimple(map, prefix + "ExcludeQuuids.", this.ExcludeQuuids);
        this.setParamSimple(map, prefix + "AutoInclude", this.AutoInclude);
        this.setParamArraySimple(map, prefix + "TagIDs.", this.TagIDs);
        this.setParamSimple(map, prefix + "TCSSScope", this.TCSSScope);
        this.setParamArraySimple(map, prefix + "ClusterIDs.", this.ClusterIDs);
        this.setParamArraySimple(map, prefix + "ExcludeClusterIDs.", this.ExcludeClusterIDs);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArraySimple(map, prefix + "ExcludeInstanceIds.", this.ExcludeInstanceIds);

    }
}

