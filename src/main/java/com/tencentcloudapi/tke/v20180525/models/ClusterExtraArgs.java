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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterExtraArgs extends AbstractModel {

    /**
    * kube-apiserver custom parameter, in the format of ["k1=v1", "k1=v2"], for example: ["max-requests-inflight=500","feature-gates=PodShareProcessNamespace=true,DynamicKubeletConfig=true"].
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("KubeAPIServer")
    @Expose
    private String [] KubeAPIServer;

    /**
    * kube-controller-manager custom parameter
Note: this field may return null, indicating that no valid value is obtained.
    */
    @SerializedName("KubeControllerManager")
    @Expose
    private String [] KubeControllerManager;

    /**
    * kube-scheduler custom parameter
Note: this field may return null, indicating that no valid value is obtained.
    */
    @SerializedName("KubeScheduler")
    @Expose
    private String [] KubeScheduler;

    /**
    * etcd custom parameter, which is only effective for self-deployed cluster.
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("Etcd")
    @Expose
    private String [] Etcd;

    /**
     * Get kube-apiserver custom parameter, in the format of ["k1=v1", "k1=v2"], for example: ["max-requests-inflight=500","feature-gates=PodShareProcessNamespace=true,DynamicKubeletConfig=true"].
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return KubeAPIServer kube-apiserver custom parameter, in the format of ["k1=v1", "k1=v2"], for example: ["max-requests-inflight=500","feature-gates=PodShareProcessNamespace=true,DynamicKubeletConfig=true"].
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String [] getKubeAPIServer() {
        return this.KubeAPIServer;
    }

    /**
     * Set kube-apiserver custom parameter, in the format of ["k1=v1", "k1=v2"], for example: ["max-requests-inflight=500","feature-gates=PodShareProcessNamespace=true,DynamicKubeletConfig=true"].
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param KubeAPIServer kube-apiserver custom parameter, in the format of ["k1=v1", "k1=v2"], for example: ["max-requests-inflight=500","feature-gates=PodShareProcessNamespace=true,DynamicKubeletConfig=true"].
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setKubeAPIServer(String [] KubeAPIServer) {
        this.KubeAPIServer = KubeAPIServer;
    }

    /**
     * Get kube-controller-manager custom parameter
Note: this field may return null, indicating that no valid value is obtained. 
     * @return KubeControllerManager kube-controller-manager custom parameter
Note: this field may return null, indicating that no valid value is obtained.
     */
    public String [] getKubeControllerManager() {
        return this.KubeControllerManager;
    }

    /**
     * Set kube-controller-manager custom parameter
Note: this field may return null, indicating that no valid value is obtained.
     * @param KubeControllerManager kube-controller-manager custom parameter
Note: this field may return null, indicating that no valid value is obtained.
     */
    public void setKubeControllerManager(String [] KubeControllerManager) {
        this.KubeControllerManager = KubeControllerManager;
    }

    /**
     * Get kube-scheduler custom parameter
Note: this field may return null, indicating that no valid value is obtained. 
     * @return KubeScheduler kube-scheduler custom parameter
Note: this field may return null, indicating that no valid value is obtained.
     */
    public String [] getKubeScheduler() {
        return this.KubeScheduler;
    }

    /**
     * Set kube-scheduler custom parameter
Note: this field may return null, indicating that no valid value is obtained.
     * @param KubeScheduler kube-scheduler custom parameter
Note: this field may return null, indicating that no valid value is obtained.
     */
    public void setKubeScheduler(String [] KubeScheduler) {
        this.KubeScheduler = KubeScheduler;
    }

    /**
     * Get etcd custom parameter, which is only effective for self-deployed cluster.
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return Etcd etcd custom parameter, which is only effective for self-deployed cluster.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String [] getEtcd() {
        return this.Etcd;
    }

    /**
     * Set etcd custom parameter, which is only effective for self-deployed cluster.
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param Etcd etcd custom parameter, which is only effective for self-deployed cluster.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setEtcd(String [] Etcd) {
        this.Etcd = Etcd;
    }

    public ClusterExtraArgs() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterExtraArgs(ClusterExtraArgs source) {
        if (source.KubeAPIServer != null) {
            this.KubeAPIServer = new String[source.KubeAPIServer.length];
            for (int i = 0; i < source.KubeAPIServer.length; i++) {
                this.KubeAPIServer[i] = new String(source.KubeAPIServer[i]);
            }
        }
        if (source.KubeControllerManager != null) {
            this.KubeControllerManager = new String[source.KubeControllerManager.length];
            for (int i = 0; i < source.KubeControllerManager.length; i++) {
                this.KubeControllerManager[i] = new String(source.KubeControllerManager[i]);
            }
        }
        if (source.KubeScheduler != null) {
            this.KubeScheduler = new String[source.KubeScheduler.length];
            for (int i = 0; i < source.KubeScheduler.length; i++) {
                this.KubeScheduler[i] = new String(source.KubeScheduler[i]);
            }
        }
        if (source.Etcd != null) {
            this.Etcd = new String[source.Etcd.length];
            for (int i = 0; i < source.Etcd.length; i++) {
                this.Etcd[i] = new String(source.Etcd[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "KubeAPIServer.", this.KubeAPIServer);
        this.setParamArraySimple(map, prefix + "KubeControllerManager.", this.KubeControllerManager);
        this.setParamArraySimple(map, prefix + "KubeScheduler.", this.KubeScheduler);
        this.setParamArraySimple(map, prefix + "Etcd.", this.Etcd);

    }
}

