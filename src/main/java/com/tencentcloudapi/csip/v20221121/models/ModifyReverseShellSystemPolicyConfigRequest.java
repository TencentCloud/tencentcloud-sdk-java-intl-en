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

public class ModifyReverseShellSystemPolicyConfigRequest extends AbstractModel {

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Intranet alert display</p>
    */
    @SerializedName("InnerNetAlarmShow")
    @Expose
    private Boolean InnerNetAlarmShow;

    /**
    * <p>Display internal ip</p>
    */
    @SerializedName("InnerIPShow")
    @Expose
    private Boolean InnerIPShow;

    /**
    * <p>Host range: 0-Specified 1-All 2-Professional Edition 3-Flagship Edition 4-Professional + Flagship</p>
    */
    @SerializedName("CWPScope")
    @Expose
    private Long CWPScope;

    /**
    * <p>Specified host list (used when CWPScope=0)</p>
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
     * Get <p>Intranet alert display</p> 
     * @return InnerNetAlarmShow <p>Intranet alert display</p>
     */
    public Boolean getInnerNetAlarmShow() {
        return this.InnerNetAlarmShow;
    }

    /**
     * Set <p>Intranet alert display</p>
     * @param InnerNetAlarmShow <p>Intranet alert display</p>
     */
    public void setInnerNetAlarmShow(Boolean InnerNetAlarmShow) {
        this.InnerNetAlarmShow = InnerNetAlarmShow;
    }

    /**
     * Get <p>Display internal ip</p> 
     * @return InnerIPShow <p>Display internal ip</p>
     */
    public Boolean getInnerIPShow() {
        return this.InnerIPShow;
    }

    /**
     * Set <p>Display internal ip</p>
     * @param InnerIPShow <p>Display internal ip</p>
     */
    public void setInnerIPShow(Boolean InnerIPShow) {
        this.InnerIPShow = InnerIPShow;
    }

    /**
     * Get <p>Host range: 0-Specified 1-All 2-Professional Edition 3-Flagship Edition 4-Professional + Flagship</p> 
     * @return CWPScope <p>Host range: 0-Specified 1-All 2-Professional Edition 3-Flagship Edition 4-Professional + Flagship</p>
     */
    public Long getCWPScope() {
        return this.CWPScope;
    }

    /**
     * Set <p>Host range: 0-Specified 1-All 2-Professional Edition 3-Flagship Edition 4-Professional + Flagship</p>
     * @param CWPScope <p>Host range: 0-Specified 1-All 2-Professional Edition 3-Flagship Edition 4-Professional + Flagship</p>
     */
    public void setCWPScope(Long CWPScope) {
        this.CWPScope = CWPScope;
    }

    /**
     * Get <p>Specified host list (used when CWPScope=0)</p> 
     * @return InstanceIDsWithAppId <p>Specified host list (used when CWPScope=0)</p>
     */
    public InstanceIDWithAppIdItem [] getInstanceIDsWithAppId() {
        return this.InstanceIDsWithAppId;
    }

    /**
     * Set <p>Specified host list (used when CWPScope=0)</p>
     * @param InstanceIDsWithAppId <p>Specified host list (used when CWPScope=0)</p>
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

    public ModifyReverseShellSystemPolicyConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyReverseShellSystemPolicyConfigRequest(ModifyReverseShellSystemPolicyConfigRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.InnerNetAlarmShow != null) {
            this.InnerNetAlarmShow = new Boolean(source.InnerNetAlarmShow);
        }
        if (source.InnerIPShow != null) {
            this.InnerIPShow = new Boolean(source.InnerIPShow);
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
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "InnerNetAlarmShow", this.InnerNetAlarmShow);
        this.setParamSimple(map, prefix + "InnerIPShow", this.InnerIPShow);
        this.setParamSimple(map, prefix + "CWPScope", this.CWPScope);
        this.setParamArrayObj(map, prefix + "InstanceIDsWithAppId.", this.InstanceIDsWithAppId);
        this.setParamArrayObj(map, prefix + "ExcludeInstanceIDsWithAppId.", this.ExcludeInstanceIDsWithAppId);
        this.setParamArraySimple(map, prefix + "TagIDs.", this.TagIDs);
        this.setParamSimple(map, prefix + "TCSSScope", this.TCSSScope);
        this.setParamArrayObj(map, prefix + "ClusterIDsWithAppId.", this.ClusterIDsWithAppId);
        this.setParamArrayObj(map, prefix + "ExcludeClusterIDsWithAppId.", this.ExcludeClusterIDsWithAppId);

    }
}

