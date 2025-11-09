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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MultiPathGatewayOriginACLInfo extends AbstractModel {

    /**
    * Describes the currently effective IP range for origin servers.
    */
    @SerializedName("MultiPathGatewayCurrentOriginACL")
    @Expose
    private MultiPathGatewayCurrentOriginACL MultiPathGatewayCurrentOriginACL;

    /**
    * When the origin IP range is updated, this field will be returned with the next version's effective origin IP range, including a comparison with the current origin IP range. this field is empty if not updated.
    */
    @SerializedName("MultiPathGatewayNextOriginACL")
    @Expose
    private MultiPathGatewayNextOriginACL MultiPathGatewayNextOriginACL;

    /**
     * Get Describes the currently effective IP range for origin servers. 
     * @return MultiPathGatewayCurrentOriginACL Describes the currently effective IP range for origin servers.
     */
    public MultiPathGatewayCurrentOriginACL getMultiPathGatewayCurrentOriginACL() {
        return this.MultiPathGatewayCurrentOriginACL;
    }

    /**
     * Set Describes the currently effective IP range for origin servers.
     * @param MultiPathGatewayCurrentOriginACL Describes the currently effective IP range for origin servers.
     */
    public void setMultiPathGatewayCurrentOriginACL(MultiPathGatewayCurrentOriginACL MultiPathGatewayCurrentOriginACL) {
        this.MultiPathGatewayCurrentOriginACL = MultiPathGatewayCurrentOriginACL;
    }

    /**
     * Get When the origin IP range is updated, this field will be returned with the next version's effective origin IP range, including a comparison with the current origin IP range. this field is empty if not updated. 
     * @return MultiPathGatewayNextOriginACL When the origin IP range is updated, this field will be returned with the next version's effective origin IP range, including a comparison with the current origin IP range. this field is empty if not updated.
     */
    public MultiPathGatewayNextOriginACL getMultiPathGatewayNextOriginACL() {
        return this.MultiPathGatewayNextOriginACL;
    }

    /**
     * Set When the origin IP range is updated, this field will be returned with the next version's effective origin IP range, including a comparison with the current origin IP range. this field is empty if not updated.
     * @param MultiPathGatewayNextOriginACL When the origin IP range is updated, this field will be returned with the next version's effective origin IP range, including a comparison with the current origin IP range. this field is empty if not updated.
     */
    public void setMultiPathGatewayNextOriginACL(MultiPathGatewayNextOriginACL MultiPathGatewayNextOriginACL) {
        this.MultiPathGatewayNextOriginACL = MultiPathGatewayNextOriginACL;
    }

    public MultiPathGatewayOriginACLInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MultiPathGatewayOriginACLInfo(MultiPathGatewayOriginACLInfo source) {
        if (source.MultiPathGatewayCurrentOriginACL != null) {
            this.MultiPathGatewayCurrentOriginACL = new MultiPathGatewayCurrentOriginACL(source.MultiPathGatewayCurrentOriginACL);
        }
        if (source.MultiPathGatewayNextOriginACL != null) {
            this.MultiPathGatewayNextOriginACL = new MultiPathGatewayNextOriginACL(source.MultiPathGatewayNextOriginACL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "MultiPathGatewayCurrentOriginACL.", this.MultiPathGatewayCurrentOriginACL);
        this.setParamObj(map, prefix + "MultiPathGatewayNextOriginACL.", this.MultiPathGatewayNextOriginACL);

    }
}

