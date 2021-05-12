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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceUpgradePreCheckResultItem extends AbstractModel{

    /**
    * The namespace of the workload
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Workload type
    */
    @SerializedName("WorkLoadKind")
    @Expose
    private String WorkLoadKind;

    /**
    * Workload name
    */
    @SerializedName("WorkLoadName")
    @Expose
    private String WorkLoadName;

    /**
    * The number of running pods in the workload before draining the node
    */
    @SerializedName("Before")
    @Expose
    private Long Before;

    /**
    * The number of running pods in the workload after draining the node
    */
    @SerializedName("After")
    @Expose
    private Long After;

    /**
    * The pod list of the workload on this node
    */
    @SerializedName("Pods")
    @Expose
    private String [] Pods;

    /**
     * Get The namespace of the workload 
     * @return Namespace The namespace of the workload
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set The namespace of the workload
     * @param Namespace The namespace of the workload
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Workload type 
     * @return WorkLoadKind Workload type
     */
    public String getWorkLoadKind() {
        return this.WorkLoadKind;
    }

    /**
     * Set Workload type
     * @param WorkLoadKind Workload type
     */
    public void setWorkLoadKind(String WorkLoadKind) {
        this.WorkLoadKind = WorkLoadKind;
    }

    /**
     * Get Workload name 
     * @return WorkLoadName Workload name
     */
    public String getWorkLoadName() {
        return this.WorkLoadName;
    }

    /**
     * Set Workload name
     * @param WorkLoadName Workload name
     */
    public void setWorkLoadName(String WorkLoadName) {
        this.WorkLoadName = WorkLoadName;
    }

    /**
     * Get The number of running pods in the workload before draining the node 
     * @return Before The number of running pods in the workload before draining the node
     */
    public Long getBefore() {
        return this.Before;
    }

    /**
     * Set The number of running pods in the workload before draining the node
     * @param Before The number of running pods in the workload before draining the node
     */
    public void setBefore(Long Before) {
        this.Before = Before;
    }

    /**
     * Get The number of running pods in the workload after draining the node 
     * @return After The number of running pods in the workload after draining the node
     */
    public Long getAfter() {
        return this.After;
    }

    /**
     * Set The number of running pods in the workload after draining the node
     * @param After The number of running pods in the workload after draining the node
     */
    public void setAfter(Long After) {
        this.After = After;
    }

    /**
     * Get The pod list of the workload on this node 
     * @return Pods The pod list of the workload on this node
     */
    public String [] getPods() {
        return this.Pods;
    }

    /**
     * Set The pod list of the workload on this node
     * @param Pods The pod list of the workload on this node
     */
    public void setPods(String [] Pods) {
        this.Pods = Pods;
    }

    public InstanceUpgradePreCheckResultItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceUpgradePreCheckResultItem(InstanceUpgradePreCheckResultItem source) {
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.WorkLoadKind != null) {
            this.WorkLoadKind = new String(source.WorkLoadKind);
        }
        if (source.WorkLoadName != null) {
            this.WorkLoadName = new String(source.WorkLoadName);
        }
        if (source.Before != null) {
            this.Before = new Long(source.Before);
        }
        if (source.After != null) {
            this.After = new Long(source.After);
        }
        if (source.Pods != null) {
            this.Pods = new String[source.Pods.length];
            for (int i = 0; i < source.Pods.length; i++) {
                this.Pods[i] = new String(source.Pods[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "WorkLoadKind", this.WorkLoadKind);
        this.setParamSimple(map, prefix + "WorkLoadName", this.WorkLoadName);
        this.setParamSimple(map, prefix + "Before", this.Before);
        this.setParamSimple(map, prefix + "After", this.After);
        this.setParamArraySimple(map, prefix + "Pods.", this.Pods);

    }
}

