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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryDetailPrice extends AbstractModel{

    /**
    * Price of additional private network bandwidth
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BandwidthPrice")
    @Expose
    private InquiryBasePrice BandwidthPrice;

    /**
    * Disk price
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DiskPrice")
    @Expose
    private InquiryBasePrice DiskPrice;

    /**
    * Price of additional partitions
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PartitionPrice")
    @Expose
    private InquiryBasePrice PartitionPrice;

    /**
    * Price of additional topics
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TopicPrice")
    @Expose
    private InquiryBasePrice TopicPrice;

    /**
    * Instance package price
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceTypePrice")
    @Expose
    private InquiryBasePrice InstanceTypePrice;

    /**
     * Get Price of additional private network bandwidth
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BandwidthPrice Price of additional private network bandwidth
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public InquiryBasePrice getBandwidthPrice() {
        return this.BandwidthPrice;
    }

    /**
     * Set Price of additional private network bandwidth
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BandwidthPrice Price of additional private network bandwidth
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBandwidthPrice(InquiryBasePrice BandwidthPrice) {
        this.BandwidthPrice = BandwidthPrice;
    }

    /**
     * Get Disk price
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DiskPrice Disk price
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public InquiryBasePrice getDiskPrice() {
        return this.DiskPrice;
    }

    /**
     * Set Disk price
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DiskPrice Disk price
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDiskPrice(InquiryBasePrice DiskPrice) {
        this.DiskPrice = DiskPrice;
    }

    /**
     * Get Price of additional partitions
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PartitionPrice Price of additional partitions
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public InquiryBasePrice getPartitionPrice() {
        return this.PartitionPrice;
    }

    /**
     * Set Price of additional partitions
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PartitionPrice Price of additional partitions
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPartitionPrice(InquiryBasePrice PartitionPrice) {
        this.PartitionPrice = PartitionPrice;
    }

    /**
     * Get Price of additional topics
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TopicPrice Price of additional topics
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public InquiryBasePrice getTopicPrice() {
        return this.TopicPrice;
    }

    /**
     * Set Price of additional topics
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TopicPrice Price of additional topics
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTopicPrice(InquiryBasePrice TopicPrice) {
        this.TopicPrice = TopicPrice;
    }

    /**
     * Get Instance package price
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceTypePrice Instance package price
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public InquiryBasePrice getInstanceTypePrice() {
        return this.InstanceTypePrice;
    }

    /**
     * Set Instance package price
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceTypePrice Instance package price
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceTypePrice(InquiryBasePrice InstanceTypePrice) {
        this.InstanceTypePrice = InstanceTypePrice;
    }

    public InquiryDetailPrice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquiryDetailPrice(InquiryDetailPrice source) {
        if (source.BandwidthPrice != null) {
            this.BandwidthPrice = new InquiryBasePrice(source.BandwidthPrice);
        }
        if (source.DiskPrice != null) {
            this.DiskPrice = new InquiryBasePrice(source.DiskPrice);
        }
        if (source.PartitionPrice != null) {
            this.PartitionPrice = new InquiryBasePrice(source.PartitionPrice);
        }
        if (source.TopicPrice != null) {
            this.TopicPrice = new InquiryBasePrice(source.TopicPrice);
        }
        if (source.InstanceTypePrice != null) {
            this.InstanceTypePrice = new InquiryBasePrice(source.InstanceTypePrice);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "BandwidthPrice.", this.BandwidthPrice);
        this.setParamObj(map, prefix + "DiskPrice.", this.DiskPrice);
        this.setParamObj(map, prefix + "PartitionPrice.", this.PartitionPrice);
        this.setParamObj(map, prefix + "TopicPrice.", this.TopicPrice);
        this.setParamObj(map, prefix + "InstanceTypePrice.", this.InstanceTypePrice);

    }
}

