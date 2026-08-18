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

public class TopicIdAndRegion extends AbstractModel {

    /**
    * Log topic id
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * The ID of the region where the log topic ID is located.

id, region, abbreviation information follows:
- 1: Guangzhou, ap-guangzhou
- 4: Shanghai, ap-shanghai
-5, Hong Kong (China), ap-hongkong
- 7: Shanghai Finance, ap-shanghai-fsi
-8, Beijing, ap-beijing
- 9, Singapore, ap-singapore
- 11: Shenzhen Finance, ap-shenzhen-fsi
-15, Silicon Valley, na-siliconvalley
-16, Chengdu, ap-chengdu
-17, Frankfurt, eu-frankfurt
- 18, Seoul, ap-seoul
- 19: Chongqing, ap-chongqing
- 22, Virginia, na-ashburn
- 23, Bangkok, ap-bangkok
-25, Tokyo, ap-tokyo
- 33, Nanjing, ap-nanjing
-46, Beijing Finance, ap-beijing-fsi
- 72, Jakarta, ap-jakarta
-74, São Paulo, sa-saopaulo
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
     * Get Log topic id 
     * @return TopicId Log topic id
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Log topic id
     * @param TopicId Log topic id
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get The ID of the region where the log topic ID is located.

id, region, abbreviation information follows:
- 1: Guangzhou, ap-guangzhou
- 4: Shanghai, ap-shanghai
-5, Hong Kong (China), ap-hongkong
- 7: Shanghai Finance, ap-shanghai-fsi
-8, Beijing, ap-beijing
- 9, Singapore, ap-singapore
- 11: Shenzhen Finance, ap-shenzhen-fsi
-15, Silicon Valley, na-siliconvalley
-16, Chengdu, ap-chengdu
-17, Frankfurt, eu-frankfurt
- 18, Seoul, ap-seoul
- 19: Chongqing, ap-chongqing
- 22, Virginia, na-ashburn
- 23, Bangkok, ap-bangkok
-25, Tokyo, ap-tokyo
- 33, Nanjing, ap-nanjing
-46, Beijing Finance, ap-beijing-fsi
- 72, Jakarta, ap-jakarta
-74, São Paulo, sa-saopaulo 
     * @return RegionId The ID of the region where the log topic ID is located.

id, region, abbreviation information follows:
- 1: Guangzhou, ap-guangzhou
- 4: Shanghai, ap-shanghai
-5, Hong Kong (China), ap-hongkong
- 7: Shanghai Finance, ap-shanghai-fsi
-8, Beijing, ap-beijing
- 9, Singapore, ap-singapore
- 11: Shenzhen Finance, ap-shenzhen-fsi
-15, Silicon Valley, na-siliconvalley
-16, Chengdu, ap-chengdu
-17, Frankfurt, eu-frankfurt
- 18, Seoul, ap-seoul
- 19: Chongqing, ap-chongqing
- 22, Virginia, na-ashburn
- 23, Bangkok, ap-bangkok
-25, Tokyo, ap-tokyo
- 33, Nanjing, ap-nanjing
-46, Beijing Finance, ap-beijing-fsi
- 72, Jakarta, ap-jakarta
-74, São Paulo, sa-saopaulo
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set The ID of the region where the log topic ID is located.

id, region, abbreviation information follows:
- 1: Guangzhou, ap-guangzhou
- 4: Shanghai, ap-shanghai
-5, Hong Kong (China), ap-hongkong
- 7: Shanghai Finance, ap-shanghai-fsi
-8, Beijing, ap-beijing
- 9, Singapore, ap-singapore
- 11: Shenzhen Finance, ap-shenzhen-fsi
-15, Silicon Valley, na-siliconvalley
-16, Chengdu, ap-chengdu
-17, Frankfurt, eu-frankfurt
- 18, Seoul, ap-seoul
- 19: Chongqing, ap-chongqing
- 22, Virginia, na-ashburn
- 23, Bangkok, ap-bangkok
-25, Tokyo, ap-tokyo
- 33, Nanjing, ap-nanjing
-46, Beijing Finance, ap-beijing-fsi
- 72, Jakarta, ap-jakarta
-74, São Paulo, sa-saopaulo
     * @param RegionId The ID of the region where the log topic ID is located.

id, region, abbreviation information follows:
- 1: Guangzhou, ap-guangzhou
- 4: Shanghai, ap-shanghai
-5, Hong Kong (China), ap-hongkong
- 7: Shanghai Finance, ap-shanghai-fsi
-8, Beijing, ap-beijing
- 9, Singapore, ap-singapore
- 11: Shenzhen Finance, ap-shenzhen-fsi
-15, Silicon Valley, na-siliconvalley
-16, Chengdu, ap-chengdu
-17, Frankfurt, eu-frankfurt
- 18, Seoul, ap-seoul
- 19: Chongqing, ap-chongqing
- 22, Virginia, na-ashburn
- 23, Bangkok, ap-bangkok
-25, Tokyo, ap-tokyo
- 33, Nanjing, ap-nanjing
-46, Beijing Finance, ap-beijing-fsi
- 72, Jakarta, ap-jakarta
-74, São Paulo, sa-saopaulo
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    public TopicIdAndRegion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TopicIdAndRegion(TopicIdAndRegion source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);

    }
}

