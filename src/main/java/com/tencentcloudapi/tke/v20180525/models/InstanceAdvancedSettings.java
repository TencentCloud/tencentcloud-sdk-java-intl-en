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

public class InstanceAdvancedSettings extends AbstractModel{

    /**
    * Data disk mount point. By default, no data disk is mounted. Data disks in ext3, ext4, or XFS file system formats will be mounted directly, while data disks in other file systems and unformatted data disks will automatically be formatted as ext4 and then mounted. Please back up your data in advance. This setting is only applicable to CVMs with a single data disk.
    */
    @SerializedName("MountTarget")
    @Expose
    private String MountTarget;

    /**
    * Specified value of dockerd --graph. Default value: /var/lib/docker
    */
    @SerializedName("DockerGraphPath")
    @Expose
    private String DockerGraphPath;

    /**
    * Base64-encoded user script, which will be executed after the K8s component starts running. You need to ensure the reentrant and retry logic of the script. The script and its log files can be viewed at the node path: /data/ccs_userscript/. If you want to initialize nodes before adding them to the scheduling list, you can use this parameter together with the unschedulable parameter. After the final initialization of userScript is completed, add the kubectl uncordon nodename --kubeconfig=/root/.kube/config command to enable the node for scheduling.
    */
    @SerializedName("UserScript")
    @Expose
    private String UserScript;

    /**
    * Sets whether the added node is schedulable. 0 (default): schedulable; other values: unschedulable. After node initialization is completed, you can run kubectl uncordon nodename to enable this node for scheduling.
    */
    @SerializedName("Unschedulable")
    @Expose
    private Long Unschedulable;

    /**
    * 
    */
    @SerializedName("Labels")
    @Expose
    private Label [] Labels;

    /**
    * 
    */
    @SerializedName("DataDisks")
    @Expose
    private DataDisk [] DataDisks;

    /**
    * Information about node custom parameters
    */
    @SerializedName("ExtraArgs")
    @Expose
    private InstanceExtraArgs ExtraArgs;

    /**
     * Get Data disk mount point. By default, no data disk is mounted. Data disks in ext3, ext4, or XFS file system formats will be mounted directly, while data disks in other file systems and unformatted data disks will automatically be formatted as ext4 and then mounted. Please back up your data in advance. This setting is only applicable to CVMs with a single data disk. 
     * @return MountTarget Data disk mount point. By default, no data disk is mounted. Data disks in ext3, ext4, or XFS file system formats will be mounted directly, while data disks in other file systems and unformatted data disks will automatically be formatted as ext4 and then mounted. Please back up your data in advance. This setting is only applicable to CVMs with a single data disk.
     */
    public String getMountTarget() {
        return this.MountTarget;
    }

    /**
     * Set Data disk mount point. By default, no data disk is mounted. Data disks in ext3, ext4, or XFS file system formats will be mounted directly, while data disks in other file systems and unformatted data disks will automatically be formatted as ext4 and then mounted. Please back up your data in advance. This setting is only applicable to CVMs with a single data disk.
     * @param MountTarget Data disk mount point. By default, no data disk is mounted. Data disks in ext3, ext4, or XFS file system formats will be mounted directly, while data disks in other file systems and unformatted data disks will automatically be formatted as ext4 and then mounted. Please back up your data in advance. This setting is only applicable to CVMs with a single data disk.
     */
    public void setMountTarget(String MountTarget) {
        this.MountTarget = MountTarget;
    }

    /**
     * Get Specified value of dockerd --graph. Default value: /var/lib/docker 
     * @return DockerGraphPath Specified value of dockerd --graph. Default value: /var/lib/docker
     */
    public String getDockerGraphPath() {
        return this.DockerGraphPath;
    }

    /**
     * Set Specified value of dockerd --graph. Default value: /var/lib/docker
     * @param DockerGraphPath Specified value of dockerd --graph. Default value: /var/lib/docker
     */
    public void setDockerGraphPath(String DockerGraphPath) {
        this.DockerGraphPath = DockerGraphPath;
    }

    /**
     * Get Base64-encoded user script, which will be executed after the K8s component starts running. You need to ensure the reentrant and retry logic of the script. The script and its log files can be viewed at the node path: /data/ccs_userscript/. If you want to initialize nodes before adding them to the scheduling list, you can use this parameter together with the unschedulable parameter. After the final initialization of userScript is completed, add the kubectl uncordon nodename --kubeconfig=/root/.kube/config command to enable the node for scheduling. 
     * @return UserScript Base64-encoded user script, which will be executed after the K8s component starts running. You need to ensure the reentrant and retry logic of the script. The script and its log files can be viewed at the node path: /data/ccs_userscript/. If you want to initialize nodes before adding them to the scheduling list, you can use this parameter together with the unschedulable parameter. After the final initialization of userScript is completed, add the kubectl uncordon nodename --kubeconfig=/root/.kube/config command to enable the node for scheduling.
     */
    public String getUserScript() {
        return this.UserScript;
    }

    /**
     * Set Base64-encoded user script, which will be executed after the K8s component starts running. You need to ensure the reentrant and retry logic of the script. The script and its log files can be viewed at the node path: /data/ccs_userscript/. If you want to initialize nodes before adding them to the scheduling list, you can use this parameter together with the unschedulable parameter. After the final initialization of userScript is completed, add the kubectl uncordon nodename --kubeconfig=/root/.kube/config command to enable the node for scheduling.
     * @param UserScript Base64-encoded user script, which will be executed after the K8s component starts running. You need to ensure the reentrant and retry logic of the script. The script and its log files can be viewed at the node path: /data/ccs_userscript/. If you want to initialize nodes before adding them to the scheduling list, you can use this parameter together with the unschedulable parameter. After the final initialization of userScript is completed, add the kubectl uncordon nodename --kubeconfig=/root/.kube/config command to enable the node for scheduling.
     */
    public void setUserScript(String UserScript) {
        this.UserScript = UserScript;
    }

    /**
     * Get Sets whether the added node is schedulable. 0 (default): schedulable; other values: unschedulable. After node initialization is completed, you can run kubectl uncordon nodename to enable this node for scheduling. 
     * @return Unschedulable Sets whether the added node is schedulable. 0 (default): schedulable; other values: unschedulable. After node initialization is completed, you can run kubectl uncordon nodename to enable this node for scheduling.
     */
    public Long getUnschedulable() {
        return this.Unschedulable;
    }

    /**
     * Set Sets whether the added node is schedulable. 0 (default): schedulable; other values: unschedulable. After node initialization is completed, you can run kubectl uncordon nodename to enable this node for scheduling.
     * @param Unschedulable Sets whether the added node is schedulable. 0 (default): schedulable; other values: unschedulable. After node initialization is completed, you can run kubectl uncordon nodename to enable this node for scheduling.
     */
    public void setUnschedulable(Long Unschedulable) {
        this.Unschedulable = Unschedulable;
    }

    /**
     * Get  
     * @return Labels 
     */
    public Label [] getLabels() {
        return this.Labels;
    }

    /**
     * Set 
     * @param Labels 
     */
    public void setLabels(Label [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get  
     * @return DataDisks 
     */
    public DataDisk [] getDataDisks() {
        return this.DataDisks;
    }

    /**
     * Set 
     * @param DataDisks 
     */
    public void setDataDisks(DataDisk [] DataDisks) {
        this.DataDisks = DataDisks;
    }

    /**
     * Get Information about node custom parameters 
     * @return ExtraArgs Information about node custom parameters
     */
    public InstanceExtraArgs getExtraArgs() {
        return this.ExtraArgs;
    }

    /**
     * Set Information about node custom parameters
     * @param ExtraArgs Information about node custom parameters
     */
    public void setExtraArgs(InstanceExtraArgs ExtraArgs) {
        this.ExtraArgs = ExtraArgs;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MountTarget", this.MountTarget);
        this.setParamSimple(map, prefix + "DockerGraphPath", this.DockerGraphPath);
        this.setParamSimple(map, prefix + "UserScript", this.UserScript);
        this.setParamSimple(map, prefix + "Unschedulable", this.Unschedulable);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamArrayObj(map, prefix + "DataDisks.", this.DataDisks);
        this.setParamObj(map, prefix + "ExtraArgs.", this.ExtraArgs);

    }
}

