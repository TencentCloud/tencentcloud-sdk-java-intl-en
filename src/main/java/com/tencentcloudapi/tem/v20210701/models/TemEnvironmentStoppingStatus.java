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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TemEnvironmentStoppingStatus extends AbstractModel{

    /**
    * Number of applications to stop
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationNumNeedToStop")
    @Expose
    private Long ApplicationNumNeedToStop;

    /**
    * Number of stopped applications
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("StoppedApplicationNum")
    @Expose
    private Long StoppedApplicationNum;

    /**
     * Get Number of applications to stop
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ApplicationNumNeedToStop Number of applications to stop
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getApplicationNumNeedToStop() {
        return this.ApplicationNumNeedToStop;
    }

    /**
     * Set Number of applications to stop
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ApplicationNumNeedToStop Number of applications to stop
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setApplicationNumNeedToStop(Long ApplicationNumNeedToStop) {
        this.ApplicationNumNeedToStop = ApplicationNumNeedToStop;
    }

    /**
     * Get Number of stopped applications
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return StoppedApplicationNum Number of stopped applications
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getStoppedApplicationNum() {
        return this.StoppedApplicationNum;
    }

    /**
     * Set Number of stopped applications
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param StoppedApplicationNum Number of stopped applications
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setStoppedApplicationNum(Long StoppedApplicationNum) {
        this.StoppedApplicationNum = StoppedApplicationNum;
    }

    public TemEnvironmentStoppingStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TemEnvironmentStoppingStatus(TemEnvironmentStoppingStatus source) {
        if (source.ApplicationNumNeedToStop != null) {
            this.ApplicationNumNeedToStop = new Long(source.ApplicationNumNeedToStop);
        }
        if (source.StoppedApplicationNum != null) {
            this.StoppedApplicationNum = new Long(source.StoppedApplicationNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationNumNeedToStop", this.ApplicationNumNeedToStop);
        this.setParamSimple(map, prefix + "StoppedApplicationNum", this.StoppedApplicationNum);

    }
}

