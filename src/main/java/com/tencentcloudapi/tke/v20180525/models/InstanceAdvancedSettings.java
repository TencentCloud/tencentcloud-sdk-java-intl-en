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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceAdvancedSettings extends AbstractModel {

    /**
    * When the custom PodCIDR mode is enabled for the cluster, you can specify the maximum number of pods per node.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("DesiredPodNumber")
    @Expose
    private Long DesiredPodNumber;

    /**
    * GPU driver-related parameters. Relevant GPU parameters can be found at: https://intl.cloud.tencent.com/document/api/213/15715?from_cn_redirect=1
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("GPUArgs")
    @Expose
    private GPUArgs GPUArgs;

    /**
    * Specifies the base64-encoded custom script to be executed before initialization of the node. It’s only valid for adding existing nodes for now.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("PreStartUserScript")
    @Expose
    private String PreStartUserScript;

    /**
    * Node taint
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Taints")
    @Expose
    private Taint [] Taints;

    /**
    * Data disk mount point. By default, no data disk is mounted. Data disks in ext3, ext4, or XFS file system formats will be mounted directly, while data disks in other file systems and unformatted data disks will automatically be formatted as ext4 (xfs for tlinux system) and then mounted. Please back up your data in advance. This setting is only applicable to CVMs with a single data disk.
Note: in multi-disk scenarios, use the DataDisks data structure below to set the corresponding information, such as cloud disk type, cloud disk size, mount path, and whether to perform formatting.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("MountTarget")
    @Expose
    private String MountTarget;

    /**
    * Specified value of dockerd --graph. Default value: /var/lib/docker
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("DockerGraphPath")
    @Expose
    private String DockerGraphPath;

    /**
    * Base64-encoded user script, which will be executed after the K8s component starts running. You need to ensure the reentrant and retry logic of the script. The script and its log files can be viewed at the node path: /data/ccs_userscript/. If you want to initialize nodes before adding them to the scheduling list, you can use this parameter together with the unschedulable parameter. After the final initialization of userScript is completed, add the kubectl uncordon nodename --kubeconfig=/root/.kube/config command to enable the node for scheduling.
Note: This field may return null, indicating that no valid value was found.
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
    * Node label array
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("Labels")
    @Expose
    private Label [] Labels;

    /**
    * Mounting information of multiple data disks. When you create a node, ensure that the CVM purchase parameter specifies the information required for the purchase of multiple data disks. For example, the `DataDisks` under `RunInstancesPara` of the `CreateClusterInstances` API should be configured accordingly (Referto document of CreateClusterInstances API). When you add an existing node, ensure that the specified partition exists in the node.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("DataDisks")
    @Expose
    private DataDisk [] DataDisks;

    /**
    * Information about node custom parameters
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("ExtraArgs")
    @Expose
    private InstanceExtraArgs ExtraArgs;

    /**
     * Get When the custom PodCIDR mode is enabled for the cluster, you can specify the maximum number of pods per node.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return DesiredPodNumber When the custom PodCIDR mode is enabled for the cluster, you can specify the maximum number of pods per node.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getDesiredPodNumber() {
        return this.DesiredPodNumber;
    }

    /**
     * Set When the custom PodCIDR mode is enabled for the cluster, you can specify the maximum number of pods per node.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param DesiredPodNumber When the custom PodCIDR mode is enabled for the cluster, you can specify the maximum number of pods per node.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDesiredPodNumber(Long DesiredPodNumber) {
        this.DesiredPodNumber = DesiredPodNumber;
    }

    /**
     * Get GPU driver-related parameters. Relevant GPU parameters can be found at: https://intl.cloud.tencent.com/document/api/213/15715?from_cn_redirect=1
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return GPUArgs GPU driver-related parameters. Relevant GPU parameters can be found at: https://intl.cloud.tencent.com/document/api/213/15715?from_cn_redirect=1
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public GPUArgs getGPUArgs() {
        return this.GPUArgs;
    }

    /**
     * Set GPU driver-related parameters. Relevant GPU parameters can be found at: https://intl.cloud.tencent.com/document/api/213/15715?from_cn_redirect=1
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param GPUArgs GPU driver-related parameters. Relevant GPU parameters can be found at: https://intl.cloud.tencent.com/document/api/213/15715?from_cn_redirect=1
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setGPUArgs(GPUArgs GPUArgs) {
        this.GPUArgs = GPUArgs;
    }

    /**
     * Get Specifies the base64-encoded custom script to be executed before initialization of the node. It’s only valid for adding existing nodes for now.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return PreStartUserScript Specifies the base64-encoded custom script to be executed before initialization of the node. It’s only valid for adding existing nodes for now.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getPreStartUserScript() {
        return this.PreStartUserScript;
    }

    /**
     * Set Specifies the base64-encoded custom script to be executed before initialization of the node. It’s only valid for adding existing nodes for now.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param PreStartUserScript Specifies the base64-encoded custom script to be executed before initialization of the node. It’s only valid for adding existing nodes for now.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setPreStartUserScript(String PreStartUserScript) {
        this.PreStartUserScript = PreStartUserScript;
    }

    /**
     * Get Node taint
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Taints Node taint
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Taint [] getTaints() {
        return this.Taints;
    }

    /**
     * Set Node taint
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Taints Node taint
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setTaints(Taint [] Taints) {
        this.Taints = Taints;
    }

    /**
     * Get Data disk mount point. By default, no data disk is mounted. Data disks in ext3, ext4, or XFS file system formats will be mounted directly, while data disks in other file systems and unformatted data disks will automatically be formatted as ext4 (xfs for tlinux system) and then mounted. Please back up your data in advance. This setting is only applicable to CVMs with a single data disk.
Note: in multi-disk scenarios, use the DataDisks data structure below to set the corresponding information, such as cloud disk type, cloud disk size, mount path, and whether to perform formatting.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return MountTarget Data disk mount point. By default, no data disk is mounted. Data disks in ext3, ext4, or XFS file system formats will be mounted directly, while data disks in other file systems and unformatted data disks will automatically be formatted as ext4 (xfs for tlinux system) and then mounted. Please back up your data in advance. This setting is only applicable to CVMs with a single data disk.
Note: in multi-disk scenarios, use the DataDisks data structure below to set the corresponding information, such as cloud disk type, cloud disk size, mount path, and whether to perform formatting.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getMountTarget() {
        return this.MountTarget;
    }

    /**
     * Set Data disk mount point. By default, no data disk is mounted. Data disks in ext3, ext4, or XFS file system formats will be mounted directly, while data disks in other file systems and unformatted data disks will automatically be formatted as ext4 (xfs for tlinux system) and then mounted. Please back up your data in advance. This setting is only applicable to CVMs with a single data disk.
Note: in multi-disk scenarios, use the DataDisks data structure below to set the corresponding information, such as cloud disk type, cloud disk size, mount path, and whether to perform formatting.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param MountTarget Data disk mount point. By default, no data disk is mounted. Data disks in ext3, ext4, or XFS file system formats will be mounted directly, while data disks in other file systems and unformatted data disks will automatically be formatted as ext4 (xfs for tlinux system) and then mounted. Please back up your data in advance. This setting is only applicable to CVMs with a single data disk.
Note: in multi-disk scenarios, use the DataDisks data structure below to set the corresponding information, such as cloud disk type, cloud disk size, mount path, and whether to perform formatting.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setMountTarget(String MountTarget) {
        this.MountTarget = MountTarget;
    }

    /**
     * Get Specified value of dockerd --graph. Default value: /var/lib/docker
Note: This field may return null, indicating that no valid value was found. 
     * @return DockerGraphPath Specified value of dockerd --graph. Default value: /var/lib/docker
Note: This field may return null, indicating that no valid value was found.
     */
    public String getDockerGraphPath() {
        return this.DockerGraphPath;
    }

    /**
     * Set Specified value of dockerd --graph. Default value: /var/lib/docker
Note: This field may return null, indicating that no valid value was found.
     * @param DockerGraphPath Specified value of dockerd --graph. Default value: /var/lib/docker
Note: This field may return null, indicating that no valid value was found.
     */
    public void setDockerGraphPath(String DockerGraphPath) {
        this.DockerGraphPath = DockerGraphPath;
    }

    /**
     * Get Base64-encoded user script, which will be executed after the K8s component starts running. You need to ensure the reentrant and retry logic of the script. The script and its log files can be viewed at the node path: /data/ccs_userscript/. If you want to initialize nodes before adding them to the scheduling list, you can use this parameter together with the unschedulable parameter. After the final initialization of userScript is completed, add the kubectl uncordon nodename --kubeconfig=/root/.kube/config command to enable the node for scheduling.
Note: This field may return null, indicating that no valid value was found. 
     * @return UserScript Base64-encoded user script, which will be executed after the K8s component starts running. You need to ensure the reentrant and retry logic of the script. The script and its log files can be viewed at the node path: /data/ccs_userscript/. If you want to initialize nodes before adding them to the scheduling list, you can use this parameter together with the unschedulable parameter. After the final initialization of userScript is completed, add the kubectl uncordon nodename --kubeconfig=/root/.kube/config command to enable the node for scheduling.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getUserScript() {
        return this.UserScript;
    }

    /**
     * Set Base64-encoded user script, which will be executed after the K8s component starts running. You need to ensure the reentrant and retry logic of the script. The script and its log files can be viewed at the node path: /data/ccs_userscript/. If you want to initialize nodes before adding them to the scheduling list, you can use this parameter together with the unschedulable parameter. After the final initialization of userScript is completed, add the kubectl uncordon nodename --kubeconfig=/root/.kube/config command to enable the node for scheduling.
Note: This field may return null, indicating that no valid value was found.
     * @param UserScript Base64-encoded user script, which will be executed after the K8s component starts running. You need to ensure the reentrant and retry logic of the script. The script and its log files can be viewed at the node path: /data/ccs_userscript/. If you want to initialize nodes before adding them to the scheduling list, you can use this parameter together with the unschedulable parameter. After the final initialization of userScript is completed, add the kubectl uncordon nodename --kubeconfig=/root/.kube/config command to enable the node for scheduling.
Note: This field may return null, indicating that no valid value was found.
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
     * Get Node label array
Note: This field may return null, indicating that no valid value was found. 
     * @return Labels Node label array
Note: This field may return null, indicating that no valid value was found.
     */
    public Label [] getLabels() {
        return this.Labels;
    }

    /**
     * Set Node label array
Note: This field may return null, indicating that no valid value was found.
     * @param Labels Node label array
Note: This field may return null, indicating that no valid value was found.
     */
    public void setLabels(Label [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get Mounting information of multiple data disks. When you create a node, ensure that the CVM purchase parameter specifies the information required for the purchase of multiple data disks. For example, the `DataDisks` under `RunInstancesPara` of the `CreateClusterInstances` API should be configured accordingly (Referto document of CreateClusterInstances API). When you add an existing node, ensure that the specified partition exists in the node.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return DataDisks Mounting information of multiple data disks. When you create a node, ensure that the CVM purchase parameter specifies the information required for the purchase of multiple data disks. For example, the `DataDisks` under `RunInstancesPara` of the `CreateClusterInstances` API should be configured accordingly (Referto document of CreateClusterInstances API). When you add an existing node, ensure that the specified partition exists in the node.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public DataDisk [] getDataDisks() {
        return this.DataDisks;
    }

    /**
     * Set Mounting information of multiple data disks. When you create a node, ensure that the CVM purchase parameter specifies the information required for the purchase of multiple data disks. For example, the `DataDisks` under `RunInstancesPara` of the `CreateClusterInstances` API should be configured accordingly (Referto document of CreateClusterInstances API). When you add an existing node, ensure that the specified partition exists in the node.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param DataDisks Mounting information of multiple data disks. When you create a node, ensure that the CVM purchase parameter specifies the information required for the purchase of multiple data disks. For example, the `DataDisks` under `RunInstancesPara` of the `CreateClusterInstances` API should be configured accordingly (Referto document of CreateClusterInstances API). When you add an existing node, ensure that the specified partition exists in the node.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDataDisks(DataDisk [] DataDisks) {
        this.DataDisks = DataDisks;
    }

    /**
     * Get Information about node custom parameters
Note: This field may return null, indicating that no valid value was found. 
     * @return ExtraArgs Information about node custom parameters
Note: This field may return null, indicating that no valid value was found.
     */
    public InstanceExtraArgs getExtraArgs() {
        return this.ExtraArgs;
    }

    /**
     * Set Information about node custom parameters
Note: This field may return null, indicating that no valid value was found.
     * @param ExtraArgs Information about node custom parameters
Note: This field may return null, indicating that no valid value was found.
     */
    public void setExtraArgs(InstanceExtraArgs ExtraArgs) {
        this.ExtraArgs = ExtraArgs;
    }

    public InstanceAdvancedSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceAdvancedSettings(InstanceAdvancedSettings source) {
        if (source.DesiredPodNumber != null) {
            this.DesiredPodNumber = new Long(source.DesiredPodNumber);
        }
        if (source.GPUArgs != null) {
            this.GPUArgs = new GPUArgs(source.GPUArgs);
        }
        if (source.PreStartUserScript != null) {
            this.PreStartUserScript = new String(source.PreStartUserScript);
        }
        if (source.Taints != null) {
            this.Taints = new Taint[source.Taints.length];
            for (int i = 0; i < source.Taints.length; i++) {
                this.Taints[i] = new Taint(source.Taints[i]);
            }
        }
        if (source.MountTarget != null) {
            this.MountTarget = new String(source.MountTarget);
        }
        if (source.DockerGraphPath != null) {
            this.DockerGraphPath = new String(source.DockerGraphPath);
        }
        if (source.UserScript != null) {
            this.UserScript = new String(source.UserScript);
        }
        if (source.Unschedulable != null) {
            this.Unschedulable = new Long(source.Unschedulable);
        }
        if (source.Labels != null) {
            this.Labels = new Label[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new Label(source.Labels[i]);
            }
        }
        if (source.DataDisks != null) {
            this.DataDisks = new DataDisk[source.DataDisks.length];
            for (int i = 0; i < source.DataDisks.length; i++) {
                this.DataDisks[i] = new DataDisk(source.DataDisks[i]);
            }
        }
        if (source.ExtraArgs != null) {
            this.ExtraArgs = new InstanceExtraArgs(source.ExtraArgs);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DesiredPodNumber", this.DesiredPodNumber);
        this.setParamObj(map, prefix + "GPUArgs.", this.GPUArgs);
        this.setParamSimple(map, prefix + "PreStartUserScript", this.PreStartUserScript);
        this.setParamArrayObj(map, prefix + "Taints.", this.Taints);
        this.setParamSimple(map, prefix + "MountTarget", this.MountTarget);
        this.setParamSimple(map, prefix + "DockerGraphPath", this.DockerGraphPath);
        this.setParamSimple(map, prefix + "UserScript", this.UserScript);
        this.setParamSimple(map, prefix + "Unschedulable", this.Unschedulable);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamArrayObj(map, prefix + "DataDisks.", this.DataDisks);
        this.setParamObj(map, prefix + "ExtraArgs.", this.ExtraArgs);

    }
}

