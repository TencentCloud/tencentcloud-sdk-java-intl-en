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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateHostMetricConfigRequest extends AbstractModel {

    /**
    * Metric Topic id
- Get the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1). Note: BizType 0: log topic (default value), 1: metric topic.
- Obtain the log topic Id through [Create Log Topic](https://www.tencentcloud.com/document/product/614/56456?from_cn_redirect=1). Note that BizType 0: log topic (default value), 1: metric topic.
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Name

-Length not exceeding 64 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Machine group id list. Supports up to 100 machine groups.
    */
    @SerializedName("MachineGroupIds")
    @Expose
    private String [] MachineGroupIds;

    /**
    * Collection frequency. Unit: ms. Minimum support 5000 ms.
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * Collection items. Support "cpu", "mem", "net", "disk", "system". **Currently only support: ALL collection items require configuration**.
- cpu:CPU
-mem: memory
-net: Network
-disk
-system
    */
    @SerializedName("HostMetricItems")
    @Expose
    private HostMetricItem [] HostMetricItems;

    /**
     * Get Metric Topic id
- Get the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1). Note: BizType 0: log topic (default value), 1: metric topic.
- Obtain the log topic Id through [Create Log Topic](https://www.tencentcloud.com/document/product/614/56456?from_cn_redirect=1). Note that BizType 0: log topic (default value), 1: metric topic. 
     * @return TopicId Metric Topic id
- Get the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1). Note: BizType 0: log topic (default value), 1: metric topic.
- Obtain the log topic Id through [Create Log Topic](https://www.tencentcloud.com/document/product/614/56456?from_cn_redirect=1). Note that BizType 0: log topic (default value), 1: metric topic.
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Metric Topic id
- Get the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1). Note: BizType 0: log topic (default value), 1: metric topic.
- Obtain the log topic Id through [Create Log Topic](https://www.tencentcloud.com/document/product/614/56456?from_cn_redirect=1). Note that BizType 0: log topic (default value), 1: metric topic.
     * @param TopicId Metric Topic id
- Get the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1). Note: BizType 0: log topic (default value), 1: metric topic.
- Obtain the log topic Id through [Create Log Topic](https://www.tencentcloud.com/document/product/614/56456?from_cn_redirect=1). Note that BizType 0: log topic (default value), 1: metric topic.
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Name

-Length not exceeding 64 characters. 
     * @return Name Name

-Length not exceeding 64 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name

-Length not exceeding 64 characters.
     * @param Name Name

-Length not exceeding 64 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Machine group id list. Supports up to 100 machine groups. 
     * @return MachineGroupIds Machine group id list. Supports up to 100 machine groups.
     */
    public String [] getMachineGroupIds() {
        return this.MachineGroupIds;
    }

    /**
     * Set Machine group id list. Supports up to 100 machine groups.
     * @param MachineGroupIds Machine group id list. Supports up to 100 machine groups.
     */
    public void setMachineGroupIds(String [] MachineGroupIds) {
        this.MachineGroupIds = MachineGroupIds;
    }

    /**
     * Get Collection frequency. Unit: ms. Minimum support 5000 ms. 
     * @return Interval Collection frequency. Unit: ms. Minimum support 5000 ms.
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set Collection frequency. Unit: ms. Minimum support 5000 ms.
     * @param Interval Collection frequency. Unit: ms. Minimum support 5000 ms.
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get Collection items. Support "cpu", "mem", "net", "disk", "system". **Currently only support: ALL collection items require configuration**.
- cpu:CPU
-mem: memory
-net: Network
-disk
-system 
     * @return HostMetricItems Collection items. Support "cpu", "mem", "net", "disk", "system". **Currently only support: ALL collection items require configuration**.
- cpu:CPU
-mem: memory
-net: Network
-disk
-system
     */
    public HostMetricItem [] getHostMetricItems() {
        return this.HostMetricItems;
    }

    /**
     * Set Collection items. Support "cpu", "mem", "net", "disk", "system". **Currently only support: ALL collection items require configuration**.
- cpu:CPU
-mem: memory
-net: Network
-disk
-system
     * @param HostMetricItems Collection items. Support "cpu", "mem", "net", "disk", "system". **Currently only support: ALL collection items require configuration**.
- cpu:CPU
-mem: memory
-net: Network
-disk
-system
     */
    public void setHostMetricItems(HostMetricItem [] HostMetricItems) {
        this.HostMetricItems = HostMetricItems;
    }

    public CreateHostMetricConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateHostMetricConfigRequest(CreateHostMetricConfigRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.MachineGroupIds != null) {
            this.MachineGroupIds = new String[source.MachineGroupIds.length];
            for (int i = 0; i < source.MachineGroupIds.length; i++) {
                this.MachineGroupIds[i] = new String(source.MachineGroupIds[i]);
            }
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.HostMetricItems != null) {
            this.HostMetricItems = new HostMetricItem[source.HostMetricItems.length];
            for (int i = 0; i < source.HostMetricItems.length; i++) {
                this.HostMetricItems[i] = new HostMetricItem(source.HostMetricItems[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "MachineGroupIds.", this.MachineGroupIds);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamArrayObj(map, prefix + "HostMetricItems.", this.HostMetricItems);

    }
}

