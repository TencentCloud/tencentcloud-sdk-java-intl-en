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
    * Currently effective origin-pull IP range.
    */
    @SerializedName("MultiPathGatewayCurrentOriginACL")
    @Expose
    private MultiPathGatewayCurrentOriginACL MultiPathGatewayCurrentOriginACL;

    /**
    * When the origin-pull IP range is updated, this field will return the origin-pull IP range that will take effect in the next version, including a contrast with the current origin-pull IP range. If there is no update, this field is empty.
    */
    @SerializedName("MultiPathGatewayNextOriginACL")
    @Expose
    private MultiPathGatewayNextOriginACL MultiPathGatewayNextOriginACL;

    /**
     * Get Currently effective origin-pull IP range. 
     * @return MultiPathGatewayCurrentOriginACL Currently effective origin-pull IP range.
     */
    public MultiPathGatewayCurrentOriginACL getMultiPathGatewayCurrentOriginACL() {
        return this.MultiPathGatewayCurrentOriginACL;
    }

    /**
     * Set Currently effective origin-pull IP range.
     * @param MultiPathGatewayCurrentOriginACL Currently effective origin-pull IP range.
     */
    public void setMultiPathGatewayCurrentOriginACL(MultiPathGatewayCurrentOriginACL MultiPathGatewayCurrentOriginACL) {
        this.MultiPathGatewayCurrentOriginACL = MultiPathGatewayCurrentOriginACL;
    }

    /**
     * Get When the origin-pull IP range is updated, this field will return the origin-pull IP range that will take effect in the next version, including a contrast with the current origin-pull IP range. If there is no update, this field is empty. 
     * @return MultiPathGatewayNextOriginACL When the origin-pull IP range is updated, this field will return the origin-pull IP range that will take effect in the next version, including a contrast with the current origin-pull IP range. If there is no update, this field is empty.
     */
    public MultiPathGatewayNextOriginACL getMultiPathGatewayNextOriginACL() {
        return this.MultiPathGatewayNextOriginACL;
    }

    /**
     * Set When the origin-pull IP range is updated, this field will return the origin-pull IP range that will take effect in the next version, including a contrast with the current origin-pull IP range. If there is no update, this field is empty.
     * @param MultiPathGatewayNextOriginACL When the origin-pull IP range is updated, this field will return the origin-pull IP range that will take effect in the next version, including a contrast with the current origin-pull IP range. If there is no update, this field is empty.
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

