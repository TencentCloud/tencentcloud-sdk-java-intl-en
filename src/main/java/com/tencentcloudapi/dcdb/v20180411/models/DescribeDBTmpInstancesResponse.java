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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBTmpInstancesResponse extends AbstractModel{

    /**
    * List of temp instances
    */
    @SerializedName("TmpInstances")
    @Expose
    private TmpInstance [] TmpInstances;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get List of temp instances 
     * @return TmpInstances List of temp instances
     */
    public TmpInstance [] getTmpInstances() {
        return this.TmpInstances;
    }

    /**
     * Set List of temp instances
     * @param TmpInstances List of temp instances
     */
    public void setTmpInstances(TmpInstance [] TmpInstances) {
        this.TmpInstances = TmpInstances;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeDBTmpInstancesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBTmpInstancesResponse(DescribeDBTmpInstancesResponse source) {
        if (source.TmpInstances != null) {
            this.TmpInstances = new TmpInstance[source.TmpInstances.length];
            for (int i = 0; i < source.TmpInstances.length; i++) {
                this.TmpInstances[i] = new TmpInstance(source.TmpInstances[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TmpInstances.", this.TmpInstances);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

