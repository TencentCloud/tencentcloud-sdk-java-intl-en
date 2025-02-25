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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApmInstancesRequest extends AbstractModel {

    /**
    * Tag list.
    */
    @SerializedName("Tags")
    @Expose
    private ApmTag [] Tags;

    /**
    * Filter by business system name.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Filter by business system id.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Whether to query the official demo business system (0 = non-demo business system, 1 = demo business system, default is 0).
    */
    @SerializedName("DemoInstanceFlag")
    @Expose
    private Long DemoInstanceFlag;

    /**
    * Whether to query all regional business systems (0 = do not query all regions, 1 = query all regions, default is 0).
    */
    @SerializedName("AllRegionsFlag")
    @Expose
    private Long AllRegionsFlag;

    /**
     * Get Tag list. 
     * @return Tags Tag list.
     */
    public ApmTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag list.
     * @param Tags Tag list.
     */
    public void setTags(ApmTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Filter by business system name. 
     * @return InstanceName Filter by business system name.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Filter by business system name.
     * @param InstanceName Filter by business system name.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Filter by business system id. 
     * @return InstanceIds Filter by business system id.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Filter by business system id.
     * @param InstanceIds Filter by business system id.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get Whether to query the official demo business system (0 = non-demo business system, 1 = demo business system, default is 0). 
     * @return DemoInstanceFlag Whether to query the official demo business system (0 = non-demo business system, 1 = demo business system, default is 0).
     */
    public Long getDemoInstanceFlag() {
        return this.DemoInstanceFlag;
    }

    /**
     * Set Whether to query the official demo business system (0 = non-demo business system, 1 = demo business system, default is 0).
     * @param DemoInstanceFlag Whether to query the official demo business system (0 = non-demo business system, 1 = demo business system, default is 0).
     */
    public void setDemoInstanceFlag(Long DemoInstanceFlag) {
        this.DemoInstanceFlag = DemoInstanceFlag;
    }

    /**
     * Get Whether to query all regional business systems (0 = do not query all regions, 1 = query all regions, default is 0). 
     * @return AllRegionsFlag Whether to query all regional business systems (0 = do not query all regions, 1 = query all regions, default is 0).
     */
    public Long getAllRegionsFlag() {
        return this.AllRegionsFlag;
    }

    /**
     * Set Whether to query all regional business systems (0 = do not query all regions, 1 = query all regions, default is 0).
     * @param AllRegionsFlag Whether to query all regional business systems (0 = do not query all regions, 1 = query all regions, default is 0).
     */
    public void setAllRegionsFlag(Long AllRegionsFlag) {
        this.AllRegionsFlag = AllRegionsFlag;
    }

    public DescribeApmInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApmInstancesRequest(DescribeApmInstancesRequest source) {
        if (source.Tags != null) {
            this.Tags = new ApmTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new ApmTag(source.Tags[i]);
            }
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.DemoInstanceFlag != null) {
            this.DemoInstanceFlag = new Long(source.DemoInstanceFlag);
        }
        if (source.AllRegionsFlag != null) {
            this.AllRegionsFlag = new Long(source.AllRegionsFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "DemoInstanceFlag", this.DemoInstanceFlag);
        this.setParamSimple(map, prefix + "AllRegionsFlag", this.AllRegionsFlag);

    }
}

