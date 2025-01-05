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
package com.tencentcloudapi.privatedns.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OutboundEndpoint extends AbstractModel {

    /**
    * Outbound endpoint ID.
    */
    @SerializedName("EndpointId")
    @Expose
    private String EndpointId;

    /**
    * Outbound endpoint name.
    */
    @SerializedName("EndpointName")
    @Expose
    private String EndpointName;

    /**
    * The region of the outbound endpoint.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Tag
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * Outbound endpoint information.
Returned only when the forwarding architecture is V2R.
    */
    @SerializedName("EndpointServiceSet")
    @Expose
    private EndpointService [] EndpointServiceSet;

    /**
    * Forwarding link architecture.
V2V: privatelink
V2R: jnsgw
    */
    @SerializedName("ForwardLinkArch")
    @Expose
    private String ForwardLinkArch;

    /**
    * Endpoint service ID.

Returned only when the forwarding architecture is V2V.

    */
    @SerializedName("EndPointServiceId")
    @Expose
    private String EndPointServiceId;

    /**
    * VIP list of the endpoint.

Returned only when the forwarding architecture is V2V.
    */
    @SerializedName("EndPointVipSet")
    @Expose
    private String [] EndPointVipSet;

    /**
     * Get Outbound endpoint ID. 
     * @return EndpointId Outbound endpoint ID.
     */
    public String getEndpointId() {
        return this.EndpointId;
    }

    /**
     * Set Outbound endpoint ID.
     * @param EndpointId Outbound endpoint ID.
     */
    public void setEndpointId(String EndpointId) {
        this.EndpointId = EndpointId;
    }

    /**
     * Get Outbound endpoint name. 
     * @return EndpointName Outbound endpoint name.
     */
    public String getEndpointName() {
        return this.EndpointName;
    }

    /**
     * Set Outbound endpoint name.
     * @param EndpointName Outbound endpoint name.
     */
    public void setEndpointName(String EndpointName) {
        this.EndpointName = EndpointName;
    }

    /**
     * Get The region of the outbound endpoint. 
     * @return Region The region of the outbound endpoint.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set The region of the outbound endpoint.
     * @param Region The region of the outbound endpoint.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Tag 
     * @return Tags Tag
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag
     * @param Tags Tag
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Outbound endpoint information.
Returned only when the forwarding architecture is V2R. 
     * @return EndpointServiceSet Outbound endpoint information.
Returned only when the forwarding architecture is V2R.
     */
    public EndpointService [] getEndpointServiceSet() {
        return this.EndpointServiceSet;
    }

    /**
     * Set Outbound endpoint information.
Returned only when the forwarding architecture is V2R.
     * @param EndpointServiceSet Outbound endpoint information.
Returned only when the forwarding architecture is V2R.
     */
    public void setEndpointServiceSet(EndpointService [] EndpointServiceSet) {
        this.EndpointServiceSet = EndpointServiceSet;
    }

    /**
     * Get Forwarding link architecture.
V2V: privatelink
V2R: jnsgw 
     * @return ForwardLinkArch Forwarding link architecture.
V2V: privatelink
V2R: jnsgw
     */
    public String getForwardLinkArch() {
        return this.ForwardLinkArch;
    }

    /**
     * Set Forwarding link architecture.
V2V: privatelink
V2R: jnsgw
     * @param ForwardLinkArch Forwarding link architecture.
V2V: privatelink
V2R: jnsgw
     */
    public void setForwardLinkArch(String ForwardLinkArch) {
        this.ForwardLinkArch = ForwardLinkArch;
    }

    /**
     * Get Endpoint service ID.

Returned only when the forwarding architecture is V2V.
 
     * @return EndPointServiceId Endpoint service ID.

Returned only when the forwarding architecture is V2V.

     */
    public String getEndPointServiceId() {
        return this.EndPointServiceId;
    }

    /**
     * Set Endpoint service ID.

Returned only when the forwarding architecture is V2V.

     * @param EndPointServiceId Endpoint service ID.

Returned only when the forwarding architecture is V2V.

     */
    public void setEndPointServiceId(String EndPointServiceId) {
        this.EndPointServiceId = EndPointServiceId;
    }

    /**
     * Get VIP list of the endpoint.

Returned only when the forwarding architecture is V2V. 
     * @return EndPointVipSet VIP list of the endpoint.

Returned only when the forwarding architecture is V2V.
     */
    public String [] getEndPointVipSet() {
        return this.EndPointVipSet;
    }

    /**
     * Set VIP list of the endpoint.

Returned only when the forwarding architecture is V2V.
     * @param EndPointVipSet VIP list of the endpoint.

Returned only when the forwarding architecture is V2V.
     */
    public void setEndPointVipSet(String [] EndPointVipSet) {
        this.EndPointVipSet = EndPointVipSet;
    }

    public OutboundEndpoint() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OutboundEndpoint(OutboundEndpoint source) {
        if (source.EndpointId != null) {
            this.EndpointId = new String(source.EndpointId);
        }
        if (source.EndpointName != null) {
            this.EndpointName = new String(source.EndpointName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
        if (source.EndpointServiceSet != null) {
            this.EndpointServiceSet = new EndpointService[source.EndpointServiceSet.length];
            for (int i = 0; i < source.EndpointServiceSet.length; i++) {
                this.EndpointServiceSet[i] = new EndpointService(source.EndpointServiceSet[i]);
            }
        }
        if (source.ForwardLinkArch != null) {
            this.ForwardLinkArch = new String(source.ForwardLinkArch);
        }
        if (source.EndPointServiceId != null) {
            this.EndPointServiceId = new String(source.EndPointServiceId);
        }
        if (source.EndPointVipSet != null) {
            this.EndPointVipSet = new String[source.EndPointVipSet.length];
            for (int i = 0; i < source.EndPointVipSet.length; i++) {
                this.EndPointVipSet[i] = new String(source.EndPointVipSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EndpointId", this.EndpointId);
        this.setParamSimple(map, prefix + "EndpointName", this.EndpointName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArrayObj(map, prefix + "EndpointServiceSet.", this.EndpointServiceSet);
        this.setParamSimple(map, prefix + "ForwardLinkArch", this.ForwardLinkArch);
        this.setParamSimple(map, prefix + "EndPointServiceId", this.EndPointServiceId);
        this.setParamArraySimple(map, prefix + "EndPointVipSet.", this.EndPointVipSet);

    }
}

