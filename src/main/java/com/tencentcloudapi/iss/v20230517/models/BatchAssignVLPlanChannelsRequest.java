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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchAssignVLPlanChannelsRequest extends AbstractModel {

    /**
    * <p>Plan ID</p>
    */
    @SerializedName("VLPlanId")
    @Expose
    private String VLPlanId;

    /**
    * <p>Operation command: 1=associate, 2=unbind</p>
    */
    @SerializedName("Cmd")
    @Expose
    private Long Cmd;

    /**
    * <p>Channel ID list, up to 500; pass at least one of this parameter and OrganizationIds (when Cmd=1)</p>
    */
    @SerializedName("ChannelIds")
    @Expose
    private String [] ChannelIds;

    /**
    * <p>List of organization IDs (valid only when Cmd=1; does not allow input when Cmd=2); unfold all channels under the organization to participate in association, and take the union with ChannelIds and remove duplicates</p>
    */
    @SerializedName("OrganizationIds")
    @Expose
    private String [] OrganizationIds;

    /**
     * Get <p>Plan ID</p> 
     * @return VLPlanId <p>Plan ID</p>
     */
    public String getVLPlanId() {
        return this.VLPlanId;
    }

    /**
     * Set <p>Plan ID</p>
     * @param VLPlanId <p>Plan ID</p>
     */
    public void setVLPlanId(String VLPlanId) {
        this.VLPlanId = VLPlanId;
    }

    /**
     * Get <p>Operation command: 1=associate, 2=unbind</p> 
     * @return Cmd <p>Operation command: 1=associate, 2=unbind</p>
     */
    public Long getCmd() {
        return this.Cmd;
    }

    /**
     * Set <p>Operation command: 1=associate, 2=unbind</p>
     * @param Cmd <p>Operation command: 1=associate, 2=unbind</p>
     */
    public void setCmd(Long Cmd) {
        this.Cmd = Cmd;
    }

    /**
     * Get <p>Channel ID list, up to 500; pass at least one of this parameter and OrganizationIds (when Cmd=1)</p> 
     * @return ChannelIds <p>Channel ID list, up to 500; pass at least one of this parameter and OrganizationIds (when Cmd=1)</p>
     */
    public String [] getChannelIds() {
        return this.ChannelIds;
    }

    /**
     * Set <p>Channel ID list, up to 500; pass at least one of this parameter and OrganizationIds (when Cmd=1)</p>
     * @param ChannelIds <p>Channel ID list, up to 500; pass at least one of this parameter and OrganizationIds (when Cmd=1)</p>
     */
    public void setChannelIds(String [] ChannelIds) {
        this.ChannelIds = ChannelIds;
    }

    /**
     * Get <p>List of organization IDs (valid only when Cmd=1; does not allow input when Cmd=2); unfold all channels under the organization to participate in association, and take the union with ChannelIds and remove duplicates</p> 
     * @return OrganizationIds <p>List of organization IDs (valid only when Cmd=1; does not allow input when Cmd=2); unfold all channels under the organization to participate in association, and take the union with ChannelIds and remove duplicates</p>
     */
    public String [] getOrganizationIds() {
        return this.OrganizationIds;
    }

    /**
     * Set <p>List of organization IDs (valid only when Cmd=1; does not allow input when Cmd=2); unfold all channels under the organization to participate in association, and take the union with ChannelIds and remove duplicates</p>
     * @param OrganizationIds <p>List of organization IDs (valid only when Cmd=1; does not allow input when Cmd=2); unfold all channels under the organization to participate in association, and take the union with ChannelIds and remove duplicates</p>
     */
    public void setOrganizationIds(String [] OrganizationIds) {
        this.OrganizationIds = OrganizationIds;
    }

    public BatchAssignVLPlanChannelsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchAssignVLPlanChannelsRequest(BatchAssignVLPlanChannelsRequest source) {
        if (source.VLPlanId != null) {
            this.VLPlanId = new String(source.VLPlanId);
        }
        if (source.Cmd != null) {
            this.Cmd = new Long(source.Cmd);
        }
        if (source.ChannelIds != null) {
            this.ChannelIds = new String[source.ChannelIds.length];
            for (int i = 0; i < source.ChannelIds.length; i++) {
                this.ChannelIds[i] = new String(source.ChannelIds[i]);
            }
        }
        if (source.OrganizationIds != null) {
            this.OrganizationIds = new String[source.OrganizationIds.length];
            for (int i = 0; i < source.OrganizationIds.length; i++) {
                this.OrganizationIds[i] = new String(source.OrganizationIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VLPlanId", this.VLPlanId);
        this.setParamSimple(map, prefix + "Cmd", this.Cmd);
        this.setParamArraySimple(map, prefix + "ChannelIds.", this.ChannelIds);
        this.setParamArraySimple(map, prefix + "OrganizationIds.", this.OrganizationIds);

    }
}

