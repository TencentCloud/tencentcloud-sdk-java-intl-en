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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RewriteLocationMap extends AbstractModel{

    /**
    * Source forwarding rule ID
    */
    @SerializedName("SourceLocationId")
    @Expose
    private String SourceLocationId;

    /**
    * Forwarding rule ID of a redirect target
    */
    @SerializedName("TargetLocationId")
    @Expose
    private String TargetLocationId;

    /**
     * Get Source forwarding rule ID 
     * @return SourceLocationId Source forwarding rule ID
     */
    public String getSourceLocationId() {
        return this.SourceLocationId;
    }

    /**
     * Set Source forwarding rule ID
     * @param SourceLocationId Source forwarding rule ID
     */
    public void setSourceLocationId(String SourceLocationId) {
        this.SourceLocationId = SourceLocationId;
    }

    /**
     * Get Forwarding rule ID of a redirect target 
     * @return TargetLocationId Forwarding rule ID of a redirect target
     */
    public String getTargetLocationId() {
        return this.TargetLocationId;
    }

    /**
     * Set Forwarding rule ID of a redirect target
     * @param TargetLocationId Forwarding rule ID of a redirect target
     */
    public void setTargetLocationId(String TargetLocationId) {
        this.TargetLocationId = TargetLocationId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceLocationId", this.SourceLocationId);
        this.setParamSimple(map, prefix + "TargetLocationId", this.TargetLocationId);

    }
}

