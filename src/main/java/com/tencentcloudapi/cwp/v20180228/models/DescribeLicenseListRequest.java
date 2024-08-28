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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLicenseListRequest extends AbstractModel {

    /**
    * Take the intersection when filtering with multiple conditions.
<li> LicenseStatus authorization status information: 0 - not used; 1 - partially used; 2 - used up; 3 - unavailable; 4 - available</li>
<li> BuyTime: time of purchase</li>
<li> LicenseType authorization type. 0: Pro Edition-pay-as-you-go; 1: Pro Edition-monthly subscription; 2: Ultimate Edition-monthly subscription</li>
<li>DeadlineStatus expiration status: NotExpired -not expired; expire - expired (including terminated); nearexpiry - about to expire</li>
<li>ResourceId resource ID</li>
<li>Keywords IP filtering</li>
<li>PayMode payment mode. 0: pay-as-you-go; 1: monthly subscription</li>
<li>OrderStatus order status. 1: normal; 2: isolated; 3: terminated</li>
<li>DealNames sub-order number, with a maximum length of 10, exceeding this will result in a failure.</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * Limit number, 10 by default.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset, which is 0 by default.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Tag filtering; filter by the platform's tag capabilities. In this case, you should pass in the tag key and tag value as an object.
    */
    @SerializedName("Tags")
    @Expose
    private Tags [] Tags;

    /**
     * Get Take the intersection when filtering with multiple conditions.
<li> LicenseStatus authorization status information: 0 - not used; 1 - partially used; 2 - used up; 3 - unavailable; 4 - available</li>
<li> BuyTime: time of purchase</li>
<li> LicenseType authorization type. 0: Pro Edition-pay-as-you-go; 1: Pro Edition-monthly subscription; 2: Ultimate Edition-monthly subscription</li>
<li>DeadlineStatus expiration status: NotExpired -not expired; expire - expired (including terminated); nearexpiry - about to expire</li>
<li>ResourceId resource ID</li>
<li>Keywords IP filtering</li>
<li>PayMode payment mode. 0: pay-as-you-go; 1: monthly subscription</li>
<li>OrderStatus order status. 1: normal; 2: isolated; 3: terminated</li>
<li>DealNames sub-order number, with a maximum length of 10, exceeding this will result in a failure.</li> 
     * @return Filters Take the intersection when filtering with multiple conditions.
<li> LicenseStatus authorization status information: 0 - not used; 1 - partially used; 2 - used up; 3 - unavailable; 4 - available</li>
<li> BuyTime: time of purchase</li>
<li> LicenseType authorization type. 0: Pro Edition-pay-as-you-go; 1: Pro Edition-monthly subscription; 2: Ultimate Edition-monthly subscription</li>
<li>DeadlineStatus expiration status: NotExpired -not expired; expire - expired (including terminated); nearexpiry - about to expire</li>
<li>ResourceId resource ID</li>
<li>Keywords IP filtering</li>
<li>PayMode payment mode. 0: pay-as-you-go; 1: monthly subscription</li>
<li>OrderStatus order status. 1: normal; 2: isolated; 3: terminated</li>
<li>DealNames sub-order number, with a maximum length of 10, exceeding this will result in a failure.</li>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Take the intersection when filtering with multiple conditions.
<li> LicenseStatus authorization status information: 0 - not used; 1 - partially used; 2 - used up; 3 - unavailable; 4 - available</li>
<li> BuyTime: time of purchase</li>
<li> LicenseType authorization type. 0: Pro Edition-pay-as-you-go; 1: Pro Edition-monthly subscription; 2: Ultimate Edition-monthly subscription</li>
<li>DeadlineStatus expiration status: NotExpired -not expired; expire - expired (including terminated); nearexpiry - about to expire</li>
<li>ResourceId resource ID</li>
<li>Keywords IP filtering</li>
<li>PayMode payment mode. 0: pay-as-you-go; 1: monthly subscription</li>
<li>OrderStatus order status. 1: normal; 2: isolated; 3: terminated</li>
<li>DealNames sub-order number, with a maximum length of 10, exceeding this will result in a failure.</li>
     * @param Filters Take the intersection when filtering with multiple conditions.
<li> LicenseStatus authorization status information: 0 - not used; 1 - partially used; 2 - used up; 3 - unavailable; 4 - available</li>
<li> BuyTime: time of purchase</li>
<li> LicenseType authorization type. 0: Pro Edition-pay-as-you-go; 1: Pro Edition-monthly subscription; 2: Ultimate Edition-monthly subscription</li>
<li>DeadlineStatus expiration status: NotExpired -not expired; expire - expired (including terminated); nearexpiry - about to expire</li>
<li>ResourceId resource ID</li>
<li>Keywords IP filtering</li>
<li>PayMode payment mode. 0: pay-as-you-go; 1: monthly subscription</li>
<li>OrderStatus order status. 1: normal; 2: isolated; 3: terminated</li>
<li>DealNames sub-order number, with a maximum length of 10, exceeding this will result in a failure.</li>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Limit number, 10 by default. 
     * @return Limit Limit number, 10 by default.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Limit number, 10 by default.
     * @param Limit Limit number, 10 by default.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset, which is 0 by default. 
     * @return Offset Offset, which is 0 by default.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset, which is 0 by default.
     * @param Offset Offset, which is 0 by default.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Tag filtering; filter by the platform's tag capabilities. In this case, you should pass in the tag key and tag value as an object. 
     * @return Tags Tag filtering; filter by the platform's tag capabilities. In this case, you should pass in the tag key and tag value as an object.
     */
    public Tags [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag filtering; filter by the platform's tag capabilities. In this case, you should pass in the tag key and tag value as an object.
     * @param Tags Tag filtering; filter by the platform's tag capabilities. In this case, you should pass in the tag key and tag value as an object.
     */
    public void setTags(Tags [] Tags) {
        this.Tags = Tags;
    }

    public DescribeLicenseListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLicenseListRequest(DescribeLicenseListRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Tags != null) {
            this.Tags = new Tags[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tags(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

