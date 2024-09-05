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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RsTagRule extends AbstractModel {

    /**
    * CLB listener ID.
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * List of real servers with tags to be modified.
    */
    @SerializedName("Targets")
    @Expose
    private Target [] Targets;

    /**
    * Forwarding rule ID, which is required only for Layer-7 rules but not for Layer-4 rules.
    */
    @SerializedName("LocationId")
    @Expose
    private String LocationId;

    /**
    * Modified tag of the real server. This parameter has a lower priority than the Tag parameter in the aforementioned [Target](https://intl.cloud.tencent.com/document/api/214/30694?from_cn_redirect=1#Target). The final tag value is based on the Tag parameter in the Target. The Tag parameter in RsTagRule will be used only when the Weight parameter in the Target is empty.
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
     * Get CLB listener ID. 
     * @return ListenerId CLB listener ID.
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set CLB listener ID.
     * @param ListenerId CLB listener ID.
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get List of real servers with tags to be modified. 
     * @return Targets List of real servers with tags to be modified.
     */
    public Target [] getTargets() {
        return this.Targets;
    }

    /**
     * Set List of real servers with tags to be modified.
     * @param Targets List of real servers with tags to be modified.
     */
    public void setTargets(Target [] Targets) {
        this.Targets = Targets;
    }

    /**
     * Get Forwarding rule ID, which is required only for Layer-7 rules but not for Layer-4 rules. 
     * @return LocationId Forwarding rule ID, which is required only for Layer-7 rules but not for Layer-4 rules.
     */
    public String getLocationId() {
        return this.LocationId;
    }

    /**
     * Set Forwarding rule ID, which is required only for Layer-7 rules but not for Layer-4 rules.
     * @param LocationId Forwarding rule ID, which is required only for Layer-7 rules but not for Layer-4 rules.
     */
    public void setLocationId(String LocationId) {
        this.LocationId = LocationId;
    }

    /**
     * Get Modified tag of the real server. This parameter has a lower priority than the Tag parameter in the aforementioned [Target](https://intl.cloud.tencent.com/document/api/214/30694?from_cn_redirect=1#Target). The final tag value is based on the Tag parameter in the Target. The Tag parameter in RsTagRule will be used only when the Weight parameter in the Target is empty. 
     * @return Tag Modified tag of the real server. This parameter has a lower priority than the Tag parameter in the aforementioned [Target](https://intl.cloud.tencent.com/document/api/214/30694?from_cn_redirect=1#Target). The final tag value is based on the Tag parameter in the Target. The Tag parameter in RsTagRule will be used only when the Weight parameter in the Target is empty.
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set Modified tag of the real server. This parameter has a lower priority than the Tag parameter in the aforementioned [Target](https://intl.cloud.tencent.com/document/api/214/30694?from_cn_redirect=1#Target). The final tag value is based on the Tag parameter in the Target. The Tag parameter in RsTagRule will be used only when the Weight parameter in the Target is empty.
     * @param Tag Modified tag of the real server. This parameter has a lower priority than the Tag parameter in the aforementioned [Target](https://intl.cloud.tencent.com/document/api/214/30694?from_cn_redirect=1#Target). The final tag value is based on the Tag parameter in the Target. The Tag parameter in RsTagRule will be used only when the Weight parameter in the Target is empty.
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

