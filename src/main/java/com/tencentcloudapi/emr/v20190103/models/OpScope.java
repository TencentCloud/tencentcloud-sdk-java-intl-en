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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OpScope extends AbstractModel {

    /**
    * The information of the services to operate on.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceInfoList")
    @Expose
    private ServiceBasicRestartInfo [] ServiceInfoList;

    /**
     * Get The information of the services to operate on.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ServiceInfoList The information of the services to operate on.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ServiceBasicRestartInfo [] getServiceInfoList() {
        return this.ServiceInfoList;
    }

    /**
     * Set The information of the services to operate on.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ServiceInfoList The information of the services to operate on.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceInfoList(ServiceBasicRestartInfo [] ServiceInfoList) {
        this.ServiceInfoList = ServiceInfoList;
    }

    public OpScope() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpScope(OpScope source) {
        if (source.ServiceInfoList != null) {
            this.ServiceInfoList = new ServiceBasicRestartInfo[source.ServiceInfoList.length];
            for (int i = 0; i < source.ServiceInfoList.length; i++) {
                this.ServiceInfoList[i] = new ServiceBasicRestartInfo(source.ServiceInfoList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ServiceInfoList.", this.ServiceInfoList);

    }
}

