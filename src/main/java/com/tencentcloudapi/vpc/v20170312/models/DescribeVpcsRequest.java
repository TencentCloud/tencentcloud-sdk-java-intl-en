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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVpcsRequest extends AbstractModel {

    /**
    * The VPC instance ID, such as `vpc-f49l6u0z`. Each request supports a maximum of 100 instances. `VpcIds` and `Filters` cannot be specified at the same time.
    */
    @SerializedName("VpcIds")
    @Expose
    private String [] VpcIds;

    /**
    * Filter condition. `VpcIds` and `Filters` cannot be specified at the same time.
Valid filters include:
<li>`vpc-name`: VPC instance name, which supports fuzzy search.</li>
<li>`is-default`: Indicates whether it is the default VPC</li>
<li>`vpc-id`: VPC instance ID, such as `vpc-f49l6u0z`</li>
<li>`cidr-block`: VPC CIDR block</li>
<li>`tag-key`: (Optional) tag key</li>
<li>`tag:tag-key`: (Optional) tag key-value pair. Replace the `tag-key` with a specified tag value. For its usage, refer to Example 2.</li>
  **Note:** If one filter has multiple values, the logical relationship between these values is `OR`. The logical relationship between filters is `AND`.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private String Offset;

    /**
    * Number of returned results. Default value: 20. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private String Limit;

    /**
     * Get The VPC instance ID, such as `vpc-f49l6u0z`. Each request supports a maximum of 100 instances. `VpcIds` and `Filters` cannot be specified at the same time. 
     * @return VpcIds The VPC instance ID, such as `vpc-f49l6u0z`. Each request supports a maximum of 100 instances. `VpcIds` and `Filters` cannot be specified at the same time.
     */
    public String [] getVpcIds() {
        return this.VpcIds;
    }

    /**
     * Set The VPC instance ID, such as `vpc-f49l6u0z`. Each request supports a maximum of 100 instances. `VpcIds` and `Filters` cannot be specified at the same time.
     * @param VpcIds The VPC instance ID, such as `vpc-f49l6u0z`. Each request supports a maximum of 100 instances. `VpcIds` and `Filters` cannot be specified at the same time.
     */
    public void setVpcIds(String [] VpcIds) {
        this.VpcIds = VpcIds;
    }

    /**
     * Get Filter condition. `VpcIds` and `Filters` cannot be specified at the same time.
Valid filters include:
<li>`vpc-name`: VPC instance name, which supports fuzzy search.</li>
<li>`is-default`: Indicates whether it is the default VPC</li>
<li>`vpc-id`: VPC instance ID, such as `vpc-f49l6u0z`</li>
<li>`cidr-block`: VPC CIDR block</li>
<li>`tag-key`: (Optional) tag key</li>
<li>`tag:tag-key`: (Optional) tag key-value pair. Replace the `tag-key` with a specified tag value. For its usage, refer to Example 2.</li>
  **Note:** If one filter has multiple values, the logical relationship between these values is `OR`. The logical relationship between filters is `AND`. 
     * @return Filters Filter condition. `VpcIds` and `Filters` cannot be specified at the same time.
Valid filters include:
<li>`vpc-name`: VPC instance name, which supports fuzzy search.</li>
<li>`is-default`: Indicates whether it is the default VPC</li>
<li>`vpc-id`: VPC instance ID, such as `vpc-f49l6u0z`</li>
<li>`cidr-block`: VPC CIDR block</li>
<li>`tag-key`: (Optional) tag key</li>
<li>`tag:tag-key`: (Optional) tag key-value pair. Replace the `tag-key` with a specified tag value. For its usage, refer to Example 2.</li>
  **Note:** If one filter has multiple values, the logical relationship between these values is `OR`. The logical relationship between filters is `AND`.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter condition. `VpcIds` and `Filters` cannot be specified at the same time.
Valid filters include:
<li>`vpc-name`: VPC instance name, which supports fuzzy search.</li>
<li>`is-default`: Indicates whether it is the default VPC</li>
<li>`vpc-id`: VPC instance ID, such as `vpc-f49l6u0z`</li>
<li>`cidr-block`: VPC CIDR block</li>
<li>`tag-key`: (Optional) tag key</li>
<li>`tag:tag-key`: (Optional) tag key-value pair. Replace the `tag-key` with a specified tag value. For its usage, refer to Example 2.</li>
  **Note:** If one filter has multiple values, the logical relationship between these values is `OR`. The logical relationship between filters is `AND`.
     * @param Filters Filter condition. `VpcIds` and `Filters` cannot be specified at the same time.
Valid filters include:
<li>`vpc-name`: VPC instance name, which supports fuzzy search.</li>
<li>`is-default`: Indicates whether it is the default VPC</li>
<li>`vpc-id`: VPC instance ID, such as `vpc-f49l6u0z`</li>
<li>`cidr-block`: VPC CIDR block</li>
<li>`tag-key`: (Optional) tag key</li>
<li>`tag:tag-key`: (Optional) tag key-value pair. Replace the `tag-key` with a specified tag value. For its usage, refer to Example 2.</li>
  **Note:** If one filter has multiple values, the logical relationship between these values is `OR`. The logical relationship between filters is `AND`.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Offset. Default value: 0. 
     * @return Offset Offset. Default value: 0.
     */
    public String getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: 0.
     * @param Offset Offset. Default value: 0.
     */
    public void setOffset(String Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned results. Default value: 20. Maximum value: 100. 
     * @return Limit Number of returned results. Default value: 20. Maximum value: 100.
     */
    public String getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results. Default value: 20. Maximum value: 100.
     * @param Limit Number of returned results. Default value: 20. Maximum value: 100.
     */
    public void setLimit(String Limit) {
        this.Limit = Limit;
    }

    public DescribeVpcsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVpcsRequest(DescribeVpcsRequest source) {
        if (source.VpcIds != null) {
            this.VpcIds = new String[source.VpcIds.length];
            for (int i = 0; i < source.VpcIds.length; i++) {
                this.VpcIds[i] = new String(source.VpcIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new String(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new String(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "VpcIds.", this.VpcIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

