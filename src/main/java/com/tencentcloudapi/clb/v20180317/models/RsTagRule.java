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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RsTagRule extends AbstractModel {

    /**
    * <p>CLB listener ID.</p>
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * <p>List of real servers with tags to be modified.</p>
    */
    @SerializedName("Targets")
    @Expose
    private Target [] Targets;

    /**
    * <p>Forwarding rule ID, required for layer-7 rules, not required for layer-4 rules.</p>
    */
    @SerializedName("LocationId")
    @Expose
    private String LocationId;

    /**
    * <p>Modified tag of the backend service. This parameter has a lower priority than the Tag parameter in the aforementioned <a href="https://www.tencentcloud.com/document/api/214/30694?from_cn_redirect=1#Target">Target</a>. The final tag value is based on the Tag parameter in the Target. The Tag parameter in RsTagRule will be used only when the Tag parameter in the Target is empty.</p>
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
     * Get <p>CLB listener ID.</p> 
     * @return ListenerId <p>CLB listener ID.</p>
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set <p>CLB listener ID.</p>
     * @param ListenerId <p>CLB listener ID.</p>
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get <p>List of real servers with tags to be modified.</p> 
     * @return Targets <p>List of real servers with tags to be modified.</p>
     */
    public Target [] getTargets() {
        return this.Targets;
    }

    /**
     * Set <p>List of real servers with tags to be modified.</p>
     * @param Targets <p>List of real servers with tags to be modified.</p>
     */
    public void setTargets(Target [] Targets) {
        this.Targets = Targets;
    }

    /**
     * Get <p>Forwarding rule ID, required for layer-7 rules, not required for layer-4 rules.</p> 
     * @return LocationId <p>Forwarding rule ID, required for layer-7 rules, not required for layer-4 rules.</p>
     */
    public String getLocationId() {
        return this.LocationId;
    }

    /**
     * Set <p>Forwarding rule ID, required for layer-7 rules, not required for layer-4 rules.</p>
     * @param LocationId <p>Forwarding rule ID, required for layer-7 rules, not required for layer-4 rules.</p>
     */
    public void setLocationId(String LocationId) {
        this.LocationId = LocationId;
    }

    /**
     * Get <p>Modified tag of the backend service. This parameter has a lower priority than the Tag parameter in the aforementioned <a href="https://www.tencentcloud.com/document/api/214/30694?from_cn_redirect=1#Target">Target</a>. The final tag value is based on the Tag parameter in the Target. The Tag parameter in RsTagRule will be used only when the Tag parameter in the Target is empty.</p> 
     * @return Tag <p>Modified tag of the backend service. This parameter has a lower priority than the Tag parameter in the aforementioned <a href="https://www.tencentcloud.com/document/api/214/30694?from_cn_redirect=1#Target">Target</a>. The final tag value is based on the Tag parameter in the Target. The Tag parameter in RsTagRule will be used only when the Tag parameter in the Target is empty.</p>
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set <p>Modified tag of the backend service. This parameter has a lower priority than the Tag parameter in the aforementioned <a href="https://www.tencentcloud.com/document/api/214/30694?from_cn_redirect=1#Target">Target</a>. The final tag value is based on the Tag parameter in the Target. The Tag parameter in RsTagRule will be used only when the Tag parameter in the Target is empty.</p>
     * @param Tag <p>Modified tag of the backend service. This parameter has a lower priority than the Tag parameter in the aforementioned <a href="https://www.tencentcloud.com/document/api/214/30694?from_cn_redirect=1#Target">Target</a>. The final tag value is based on the Tag parameter in the Target. The Tag parameter in RsTagRule will be used only when the Tag parameter in the Target is empty.</p>
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    public RsTagRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RsTagRule(RsTagRule source) {
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.Targets != null) {
            this.Targets = new Target[source.Targets.length];
            for (int i = 0; i < source.Targets.length; i++) {
                this.Targets[i] = new Target(source.Targets[i]);
            }
        }
        if (source.LocationId != null) {
            this.LocationId = new String(source.LocationId);
        }
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamArrayObj(map, prefix + "Targets.", this.Targets);
        this.setParamSimple(map, prefix + "LocationId", this.LocationId);
        this.setParamSimple(map, prefix + "Tag", this.Tag);

    }
}

