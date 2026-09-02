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

public class CommandSandboxFileRuleBase extends AbstractModel {

    /**
    * <p>rule name</p>
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * <p>Rule asset scope type</p><p>Enumeration values:</p><ul><li>HOST: Host</li><li>CONTAINER: Container</li></ul>
    */
    @SerializedName("BelongAssetType")
    @Expose
    private String BelongAssetType;

    /**
    * <p>Rule effective scope</p>
    */
    @SerializedName("EffectScope")
    @Expose
    private TrafficSandboxEffectScope EffectScope;

    /**
    * <p>Rule behavior type</p><p>Enumeration values:</p><ul><li>RO: read-only</li><li>RW: read-write</li></ul>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * <p>Allowlist path</p>
    */
    @SerializedName("PathWhitelist")
    @Expose
    private String [] PathWhitelist;

    /**
    * <p>Rule status</p><p>Enumeration values: </p><ul><li>ON: Enablement</li><li>OFF: Disablement</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

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
     * Get <p>Rule asset scope type</p><p>Enumeration values:</p><ul><li>HOST: Host</li><li>CONTAINER: Container</li></ul> 
     * @return BelongAssetType <p>Rule asset scope type</p><p>Enumeration values:</p><ul><li>HOST: Host</li><li>CONTAINER: Container</li></ul>
     */
    public String getBelongAssetType() {
        return this.BelongAssetType;
    }

    /**
     * Set <p>Rule asset scope type</p><p>Enumeration values:</p><ul><li>HOST: Host</li><li>CONTAINER: Container</li></ul>
     * @param BelongAssetType <p>Rule asset scope type</p><p>Enumeration values:</p><ul><li>HOST: Host</li><li>CONTAINER: Container</li></ul>
     */
    public void setBelongAssetType(String BelongAssetType) {
        this.BelongAssetType = BelongAssetType;
    }

    /**
     * Get <p>Rule effective scope</p> 
     * @return EffectScope <p>Rule effective scope</p>
     */
    public TrafficSandboxEffectScope getEffectScope() {
        return this.EffectScope;
    }

    /**
     * Set <p>Rule effective scope</p>
     * @param EffectScope <p>Rule effective scope</p>
     */
    public void setEffectScope(TrafficSandboxEffectScope EffectScope) {
        this.EffectScope = EffectScope;
    }

    /**
     * Get <p>Rule behavior type</p><p>Enumeration values:</p><ul><li>RO: read-only</li><li>RW: read-write</li></ul> 
     * @return Action <p>Rule behavior type</p><p>Enumeration values:</p><ul><li>RO: read-only</li><li>RW: read-write</li></ul>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set <p>Rule behavior type</p><p>Enumeration values:</p><ul><li>RO: read-only</li><li>RW: read-write</li></ul>
     * @param Action <p>Rule behavior type</p><p>Enumeration values:</p><ul><li>RO: read-only</li><li>RW: read-write</li></ul>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get <p>Allowlist path</p> 
     * @return PathWhitelist <p>Allowlist path</p>
     */
    public String [] getPathWhitelist() {
        return this.PathWhitelist;
    }

    /**
     * Set <p>Allowlist path</p>
     * @param PathWhitelist <p>Allowlist path</p>
     */
    public void setPathWhitelist(String [] PathWhitelist) {
        this.PathWhitelist = PathWhitelist;
    }

    /**
     * Get <p>Rule status</p><p>Enumeration values: </p><ul><li>ON: Enablement</li><li>OFF: Disablement</li></ul> 
     * @return Status <p>Rule status</p><p>Enumeration values: </p><ul><li>ON: Enablement</li><li>OFF: Disablement</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Rule status</p><p>Enumeration values: </p><ul><li>ON: Enablement</li><li>OFF: Disablement</li></ul>
     * @param Status <p>Rule status</p><p>Enumeration values: </p><ul><li>ON: Enablement</li><li>OFF: Disablement</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public CommandSandboxFileRuleBase() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CommandSandboxFileRuleBase(CommandSandboxFileRuleBase source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.BelongAssetType != null) {
            this.BelongAssetType = new String(source.BelongAssetType);
        }
        if (source.EffectScope != null) {
            this.EffectScope = new TrafficSandboxEffectScope(source.EffectScope);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.PathWhitelist != null) {
            this.PathWhitelist = new String[source.PathWhitelist.length];
            for (int i = 0; i < source.PathWhitelist.length; i++) {
                this.PathWhitelist[i] = new String(source.PathWhitelist[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "BelongAssetType", this.BelongAssetType);
        this.setParamObj(map, prefix + "EffectScope.", this.EffectScope);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamArraySimple(map, prefix + "PathWhitelist.", this.PathWhitelist);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

