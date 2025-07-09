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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DDoSGeoIPBlockConfig extends AbstractModel {

    /**
    * Region type. Valid values:
`oversea`: Outside the Chinese mainland
`china`: The Chinese mainland
`customized`: User-specified region
]
    */
    @SerializedName("RegionType")
    @Expose
    private String RegionType;

    /**
    * Blocking action. Valid values:
`drop`: the request is blocked.
`trans`: the request is allowed.
]
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Configuration ID, which is generated after a configuration is added. This field is only required to modify or delete a configuration.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * When `RegionType = customized`, AreaList is required and contains up to 128 areas.
    */
    @SerializedName("AreaList")
    @Expose
    private Long [] AreaList;

    /**
     * Get Region type. Valid values:
`oversea`: Outside the Chinese mainland
`china`: The Chinese mainland
`customized`: User-specified region
] 
     * @return RegionType Region type. Valid values:
`oversea`: Outside the Chinese mainland
`china`: The Chinese mainland
`customized`: User-specified region
]
     */
    public String getRegionType() {
        return this.RegionType;
    }

    /**
     * Set Region type. Valid values:
`oversea`: Outside the Chinese mainland
`china`: The Chinese mainland
`customized`: User-specified region
]
     * @param RegionType Region type. Valid values:
`oversea`: Outside the Chinese mainland
`china`: The Chinese mainland
`customized`: User-specified region
]
     */
    public void setRegionType(String RegionType) {
        this.RegionType = RegionType;
    }

    /**
     * Get Blocking action. Valid values:
`drop`: the request is blocked.
`trans`: the request is allowed.
] 
     * @return Action Blocking action. Valid values:
`drop`: the request is blocked.
`trans`: the request is allowed.
]
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Blocking action. Valid values:
`drop`: the request is blocked.
`trans`: the request is allowed.
]
     * @param Action Blocking action. Valid values:
`drop`: the request is blocked.
`trans`: the request is allowed.
]
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Configuration ID, which is generated after a configuration is added. This field is only required to modify or delete a configuration. 
     * @return Id Configuration ID, which is generated after a configuration is added. This field is only required to modify or delete a configuration.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Configuration ID, which is generated after a configuration is added. This field is only required to modify or delete a configuration.
     * @param Id Configuration ID, which is generated after a configuration is added. This field is only required to modify or delete a configuration.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get When `RegionType = customized`, AreaList is required and contains up to 128 areas. 
     * @return AreaList When `RegionType = customized`, AreaList is required and contains up to 128 areas.
     */
    public Long [] getAreaList() {
        return this.AreaList;
    }

    /**
     * Set When `RegionType = customized`, AreaList is required and contains up to 128 areas.
     * @param AreaList When `RegionType = customized`, AreaList is required and contains up to 128 areas.
     */
    public void setAreaList(Long [] AreaList) {
        this.AreaList = AreaList;
    }

    public DDoSGeoIPBlockConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DDoSGeoIPBlockConfig(DDoSGeoIPBlockConfig source) {
        if (source.RegionType != null) {
            this.RegionType = new String(source.RegionType);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.AreaList != null) {
            this.AreaList = new Long[source.AreaList.length];
            for (int i = 0; i < source.AreaList.length; i++) {
                this.AreaList[i] = new Long(source.AreaList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegionType", this.RegionType);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArraySimple(map, prefix + "AreaList.", this.AreaList);

    }
}

