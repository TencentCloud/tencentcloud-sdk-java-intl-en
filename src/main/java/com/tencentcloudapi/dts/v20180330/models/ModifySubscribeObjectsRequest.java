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
package com.tencentcloudapi.dts.v20180330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySubscribeObjectsRequest extends AbstractModel {

    /**
    * Data subscription instance ID
    */
    @SerializedName("SubscribeId")
    @Expose
    private String SubscribeId;

    /**
    * Data subscription type. Valid values: 0 (full instance subscription), 1 (data subscription), 2 (structure subscription), 3 (data subscription + structure subscription)
    */
    @SerializedName("SubscribeObjectType")
    @Expose
    private Long SubscribeObjectType;

    /**
    * Information of subscribed table
    */
    @SerializedName("Objects")
    @Expose
    private SubscribeObject [] Objects;

    /**
     * Get Data subscription instance ID 
     * @return SubscribeId Data subscription instance ID
     */
    public String getSubscribeId() {
        return this.SubscribeId;
    }

    /**
     * Set Data subscription instance ID
     * @param SubscribeId Data subscription instance ID
     */
    public void setSubscribeId(String SubscribeId) {
        this.SubscribeId = SubscribeId;
    }

    /**
     * Get Data subscription type. Valid values: 0 (full instance subscription), 1 (data subscription), 2 (structure subscription), 3 (data subscription + structure subscription) 
     * @return SubscribeObjectType Data subscription type. Valid values: 0 (full instance subscription), 1 (data subscription), 2 (structure subscription), 3 (data subscription + structure subscription)
     */
    public Long getSubscribeObjectType() {
        return this.SubscribeObjectType;
    }

    /**
     * Set Data subscription type. Valid values: 0 (full instance subscription), 1 (data subscription), 2 (structure subscription), 3 (data subscription + structure subscription)
     * @param SubscribeObjectType Data subscription type. Valid values: 0 (full instance subscription), 1 (data subscription), 2 (structure subscription), 3 (data subscription + structure subscription)
     */
    public void setSubscribeObjectType(Long SubscribeObjectType) {
        this.SubscribeObjectType = SubscribeObjectType;
    }

    /**
     * Get Information of subscribed table 
     * @return Objects Information of subscribed table
     */
    public SubscribeObject [] getObjects() {
        return this.Objects;
    }

    /**
     * Set Information of subscribed table
     * @param Objects Information of subscribed table
     */
    public void setObjects(SubscribeObject [] Objects) {
        this.Objects = Objects;
    }

    public ModifySubscribeObjectsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySubscribeObjectsRequest(ModifySubscribeObjectsRequest source) {
        if (source.SubscribeId != null) {
            this.SubscribeId = new String(source.SubscribeId);
        }
        if (source.SubscribeObjectType != null) {
            this.SubscribeObjectType = new Long(source.SubscribeObjectType);
        }
        if (source.Objects != null) {
            this.Objects = new SubscribeObject[source.Objects.length];
            for (int i = 0; i < source.Objects.length; i++) {
                this.Objects[i] = new SubscribeObject(source.Objects[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubscribeId", this.SubscribeId);
        this.setParamSimple(map, prefix + "SubscribeObjectType", this.SubscribeObjectType);
        this.setParamArrayObj(map, prefix + "Objects.", this.Objects);

    }
}

