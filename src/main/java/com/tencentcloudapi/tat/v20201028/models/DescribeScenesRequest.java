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

public class DescribeScenesRequest extends AbstractModel {

    /**
    * Scene ID array.

The maximum per request is 100.

Parameters must not specify both `SceneIds` and `Filters` simultaneously.

    */
    @SerializedName("SceneIds")
    @Expose
    private String [] SceneIds;

    /**
    * Filter criteria

- scene-id - String - required: no - (filter condition) filter by the scene id.
-scene-name - String - required: no - (filtering conditions) filter by scenario name.
-created-by - String - required: no - (filter criteria) filter by scene creator, currently only support TAT, representing public scenarios.

The maximum number of `Filters` per request is 10, and that of `Filter.Values` is 5. the `SceneIds` and `Filters` parameters cannot be specified at the same time.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Number of returned results, defaults to 20 with a maximum value of 100. for further introduction about `Limit`, see relevant sections in the API [overview](https://www.tencentcloud.com/document/API/213/15688?from_cn_redirect=1).
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
     * Get Scene ID array.

The maximum per request is 100.

Parameters must not specify both `SceneIds` and `Filters` simultaneously.
 
     * @return SceneIds Scene ID array.

The maximum per request is 100.

Parameters must not specify both `SceneIds` and `Filters` simultaneously.

     */
    public String [] getSceneIds() {
        return this.SceneIds;
    }

    /**
     * Set Scene ID array.

The maximum per request is 100.

Parameters must not specify both `SceneIds` and `Filters` simultaneously.

     * @param SceneIds Scene ID array.

The maximum per request is 100.

Parameters must not specify both `SceneIds` and `Filters` simultaneously.

     */
    public void setSceneIds(String [] SceneIds) {
        this.SceneIds = SceneIds;
    }

    /**
     * Get Filter criteria

- scene-id - String - required: no - (filter condition) filter by the scene id.
-scene-name - String - required: no - (filtering conditions) filter by scenario name.
-created-by - String - required: no - (filter criteria) filter by scene creator, currently only support TAT, representing public scenarios.

The maximum number of `Filters` per request is 10, and that of `Filter.Values` is 5. the `SceneIds` and `Filters` parameters cannot be specified at the same time. 
     * @return Filters Filter criteria

- scene-id - String - required: no - (filter condition) filter by the scene id.
-scene-name - String - required: no - (filtering conditions) filter by scenario name.
-created-by - String - required: no - (filter criteria) filter by scene creator, currently only support TAT, representing public scenarios.

The maximum number of `Filters` per request is 10, and that of `Filter.Values` is 5. the `SceneIds` and `Filters` parameters cannot be specified at the same time.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria

- scene-id - String - required: no - (filter condition) filter by the scene id.
-scene-name - String - required: no - (filtering conditions) filter by scenario name.
-created-by - String - required: no - (filter criteria) filter by scene creator, currently only support TAT, representing public scenarios.

The maximum number of `Filters` per request is 10, and that of `Filter.Values` is 5. the `SceneIds` and `Filters` parameters cannot be specified at the same time.
     * @param Filters Filter criteria

- scene-id - String - required: no - (filter condition) filter by the scene id.
-scene-name - String - required: no - (filtering conditions) filter by scenario name.
-created-by - String - required: no - (filter criteria) filter by scene creator, currently only support TAT, representing public scenarios.

The maximum number of `Filters` per request is 10, and that of `Filter.Values` is 5. the `SceneIds` and `Filters` parameters cannot be specified at the same time.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Number of returned results, defaults to 20 with a maximum value of 100. for further introduction about `Limit`, see relevant sections in the API [overview](https://www.tencentcloud.com/document/API/213/15688?from_cn_redirect=1). 
     * @return Limit Number of returned results, defaults to 20 with a maximum value of 100. for further introduction about `Limit`, see relevant sections in the API [overview](https://www.tencentcloud.com/document/API/213/15688?from_cn_redirect=1).
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results, defaults to 20 with a maximum value of 100. for further introduction about `Limit`, see relevant sections in the API [overview](https://www.tencentcloud.com/document/API/213/15688?from_cn_redirect=1).
     * @param Limit Number of returned results, defaults to 20 with a maximum value of 100. for further introduction about `Limit`, see relevant sections in the API [overview](https://www.tencentcloud.com/document/API/213/15688?from_cn_redirect=1).
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

    public DescribeScenesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeScenesRequest(DescribeScenesRequest source) {
        if (source.SceneIds != null) {
            this.SceneIds = new String[source.SceneIds.length];
            for (int i = 0; i < source.SceneIds.length; i++) {
                this.SceneIds[i] = new String(source.SceneIds[i]);
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
        this.setParamArraySimple(map, prefix + "SceneIds.", this.SceneIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

