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
package com.tencentcloudapi.tat.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCommandsRequest extends AbstractModel {

    /**
    * List of command IDs. Up to 100 IDs are allowed for each request. `CommandIds` and `Filters` cannot be specified at the same time.
    */
    @SerializedName("CommandIds")
    @Expose
    private String [] CommandIds;

    /**
    * Filter criteria

- command-id - String - required: no - (filter condition) filter by the command id.
- command-name - String - required: no - (filter condition) filter by the command name.
-command-type - String - required: no - (filtering conditions) filters by command type. valid values: SHELL, POWERSHELL, BAT.
-scene-id - String - required: no - (filter condition) filter by scenario id. obtain scenario id through the [DescribeScenes (query scenario)](https://www.tencentcloud.comom/document/api/1340/109968?from_cn_redirect=1) api.
-created-by - String - required: no - (filter condition) filter by command creator, value is TAT or USER. TAT represents public command, USER represents USER created command.
- tag-key - String - required: no - (filter condition) filter by the tag key.
- tag-value - String - required: no - (filter condition) filter by the tag value.
- tag:tag-key - String - required: no - (filter condition) filter by the tag-key - value pair. replace tag-key with a specific tag key. for usage, see example 4.

The maximum number of `Filters` per request is 10, and that of `Filter.Values` is 5. the `CommandIds` and `Filters` parameters cannot be specified at the same time.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Number of returned results. It defaults to `20`. The maximum is 100. For more information on `Limit`, see the relevant section in the API [Overview](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset. The default value is `0`. For more information on `Offset`, see the relevant section in API [Introduction](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get List of command IDs. Up to 100 IDs are allowed for each request. `CommandIds` and `Filters` cannot be specified at the same time. 
     * @return CommandIds List of command IDs. Up to 100 IDs are allowed for each request. `CommandIds` and `Filters` cannot be specified at the same time.
     */
    public String [] getCommandIds() {
        return this.CommandIds;
    }

    /**
     * Set List of command IDs. Up to 100 IDs are allowed for each request. `CommandIds` and `Filters` cannot be specified at the same time.
     * @param CommandIds List of command IDs. Up to 100 IDs are allowed for each request. `CommandIds` and `Filters` cannot be specified at the same time.
     */
    public void setCommandIds(String [] CommandIds) {
        this.CommandIds = CommandIds;
    }

    /**
     * Get Filter criteria

- command-id - String - required: no - (filter condition) filter by the command id.
- command-name - String - required: no - (filter condition) filter by the command name.
-command-type - String - required: no - (filtering conditions) filters by command type. valid values: SHELL, POWERSHELL, BAT.
-scene-id - String - required: no - (filter condition) filter by scenario id. obtain scenario id through the [DescribeScenes (query scenario)](https://www.tencentcloud.comom/document/api/1340/109968?from_cn_redirect=1) api.
-created-by - String - required: no - (filter condition) filter by command creator, value is TAT or USER. TAT represents public command, USER represents USER created command.
- tag-key - String - required: no - (filter condition) filter by the tag key.
- tag-value - String - required: no - (filter condition) filter by the tag value.
- tag:tag-key - String - required: no - (filter condition) filter by the tag-key - value pair. replace tag-key with a specific tag key. for usage, see example 4.

The maximum number of `Filters` per request is 10, and that of `Filter.Values` is 5. the `CommandIds` and `Filters` parameters cannot be specified at the same time. 
     * @return Filters Filter criteria

- command-id - String - required: no - (filter condition) filter by the command id.
- command-name - String - required: no - (filter condition) filter by the command name.
-command-type - String - required: no - (filtering conditions) filters by command type. valid values: SHELL, POWERSHELL, BAT.
-scene-id - String - required: no - (filter condition) filter by scenario id. obtain scenario id through the [DescribeScenes (query scenario)](https://www.tencentcloud.comom/document/api/1340/109968?from_cn_redirect=1) api.
-created-by - String - required: no - (filter condition) filter by command creator, value is TAT or USER. TAT represents public command, USER represents USER created command.
- tag-key - String - required: no - (filter condition) filter by the tag key.
- tag-value - String - required: no - (filter condition) filter by the tag value.
- tag:tag-key - String - required: no - (filter condition) filter by the tag-key - value pair. replace tag-key with a specific tag key. for usage, see example 4.

The maximum number of `Filters` per request is 10, and that of `Filter.Values` is 5. the `CommandIds` and `Filters` parameters cannot be specified at the same time.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria

- command-id - String - required: no - (filter condition) filter by the command id.
- command-name - String - required: no - (filter condition) filter by the command name.
-command-type - String - required: no - (filtering conditions) filters by command type. valid values: SHELL, POWERSHELL, BAT.
-scene-id - String - required: no - (filter condition) filter by scenario id. obtain scenario id through the [DescribeScenes (query scenario)](https://www.tencentcloud.comom/document/api/1340/109968?from_cn_redirect=1) api.
-created-by - String - required: no - (filter condition) filter by command creator, value is TAT or USER. TAT represents public command, USER represents USER created command.
- tag-key - String - required: no - (filter condition) filter by the tag key.
- tag-value - String - required: no - (filter condition) filter by the tag value.
- tag:tag-key - String - required: no - (filter condition) filter by the tag-key - value pair. replace tag-key with a specific tag key. for usage, see example 4.

The maximum number of `Filters` per request is 10, and that of `Filter.Values` is 5. the `CommandIds` and `Filters` parameters cannot be specified at the same time.
     * @param Filters Filter criteria

- command-id - String - required: no - (filter condition) filter by the command id.
- command-name - String - required: no - (filter condition) filter by the command name.
-command-type - String - required: no - (filtering conditions) filters by command type. valid values: SHELL, POWERSHELL, BAT.
-scene-id - String - required: no - (filter condition) filter by scenario id. obtain scenario id through the [DescribeScenes (query scenario)](https://www.tencentcloud.comom/document/api/1340/109968?from_cn_redirect=1) api.
-created-by - String - required: no - (filter condition) filter by command creator, value is TAT or USER. TAT represents public command, USER represents USER created command.
- tag-key - String - required: no - (filter condition) filter by the tag key.
- tag-value - String - required: no - (filter condition) filter by the tag value.
- tag:tag-key - String - required: no - (filter condition) filter by the tag-key - value pair. replace tag-key with a specific tag key. for usage, see example 4.

The maximum number of `Filters` per request is 10, and that of `Filter.Values` is 5. the `CommandIds` and `Filters` parameters cannot be specified at the same time.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Number of returned results. It defaults to `20`. The maximum is 100. For more information on `Limit`, see the relevant section in the API [Overview](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1). 
     * @return Limit Number of returned results. It defaults to `20`. The maximum is 100. For more information on `Limit`, see the relevant section in the API [Overview](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results. It defaults to `20`. The maximum is 100. For more information on `Limit`, see the relevant section in the API [Overview](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     * @param Limit Number of returned results. It defaults to `20`. The maximum is 100. For more information on `Limit`, see the relevant section in the API [Overview](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset. The default value is `0`. For more information on `Offset`, see the relevant section in API [Introduction](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1). 
     * @return Offset Offset. The default value is `0`. For more information on `Offset`, see the relevant section in API [Introduction](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. The default value is `0`. For more information on `Offset`, see the relevant section in API [Introduction](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     * @param Offset Offset. The default value is `0`. For more information on `Offset`, see the relevant section in API [Introduction](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeCommandsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCommandsRequest(DescribeCommandsRequest source) {
        if (source.CommandIds != null) {
            this.CommandIds = new String[source.CommandIds.length];
            for (int i = 0; i < source.CommandIds.length; i++) {
                this.CommandIds[i] = new String(source.CommandIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "CommandIds.", this.CommandIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

