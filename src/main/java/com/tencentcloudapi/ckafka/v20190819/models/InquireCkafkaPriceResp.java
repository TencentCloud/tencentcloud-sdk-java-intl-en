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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquireCkafkaPriceResp extends AbstractModel {

    /**
    * Instance price
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstancePrice")
    @Expose
    private InquiryPrice InstancePrice;

    /**
    * Public network bandwidth price
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PublicNetworkBandwidthPrice")
    @Expose
    private InquiryPrice PublicNetworkBandwidthPrice;

    /**
     * Get Instance price
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstancePrice Instance price
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public InquiryPrice getInstancePrice() {
        return this.InstancePrice;
    }

    /**
     * Set Instance price
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstancePrice Instance price
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstancePrice(InquiryPrice InstancePrice) {
        this.InstancePrice = InstancePrice;
    }

    /**
     * Get Public network bandwidth price
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PublicNetworkBandwidthPrice Public network bandwidth price
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public InquiryPrice getPublicNetworkBandwidthPrice() {
        return this.PublicNetworkBandwidthPrice;
    }

    /**
     * Set Public network bandwidth price
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PublicNetworkBandwidthPrice Public network bandwidth price
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPublicNetworkBandwidthPrice(InquiryPrice PublicNetworkBandwidthPrice) {
        this.PublicNetworkBandwidthPrice = PublicNetworkBandwidthPrice;
    }

    public InquireCkafkaPriceResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquireCkafkaPriceResp(InquireCkafkaPriceResp source) {
        if (source.InstancePrice != null) {
            this.InstancePrice = new InquiryPrice(source.InstancePrice);
        }
        if (source.PublicNetworkBandwidthPrice != null) {
            this.PublicNetworkBandwidthPrice = new InquiryPrice(source.PublicNetworkBandwidthPrice);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "InstancePrice.", this.InstancePrice);
        this.setParamObj(map, prefix + "PublicNetworkBandwidthPrice.", this.PublicNetworkBandwidthPrice);

    }
}

