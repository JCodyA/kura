/*******************************************************************************
 * Copyright (c) 2011, 2020 Eurotech and/or its affiliates and others
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Eurotech
 ******************************************************************************/
package org.eclipse.kura.net.dhcp;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The configuration representing generic portion of DHCP server configuration.
 *
 * @noextend This class is not intended to be subclassed by clients.
 * @since 1.2
 */
@ProviderType
public class DhcpServerCfg {

    private String interfaceName;
    private boolean enabled;
    private int defaultLeaseTime;
    private int maximumLeaseTime;
    private boolean passDns;

    /**
     * The basic Constructor for a DhcpServerCfg
     *
     * @param interfaceName
     *            the interface name associated with the DhcpServerConfig
     * @param enabled
     *            the status of the DhcpServer as a boolean
     * @param defaultLeaseTime
     *            the default lease time to issue to DHCP clients
     * @param maximumLeaseTime
     *            the maximum lease time to issue to DHCP clients
     * @param passDns
     *            whether or not to pass DNS to DHCP clients
     */
    public DhcpServerCfg(String interfaceName, boolean enabled, int defaultLeaseTime, int maximumLeaseTime,
            boolean passDns) {
        super();
        this.interfaceName = interfaceName;
        this.enabled = enabled;
        this.defaultLeaseTime = defaultLeaseTime;
        this.maximumLeaseTime = maximumLeaseTime;
        this.passDns = passDns;
    }

    public String getInterfaceName() {
        return this.interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public int getDefaultLeaseTime() {
        return this.defaultLeaseTime;
    }

    public void setDefaultLeaseTime(int defaultLeaseTime) {
        this.defaultLeaseTime = defaultLeaseTime;
    }

    public int getMaximumLeaseTime() {
        return this.maximumLeaseTime;
    }

    public void setMaximumLeaseTime(int maximumLeaseTime) {
        this.maximumLeaseTime = maximumLeaseTime;
    }

    public boolean isPassDns() {
        return this.passDns;
    }

    public void setPassDns(boolean passDns) {
        this.passDns = passDns;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(this.getClass().getName());
        sb.append(": [").append("ifaceName=").append(this.interfaceName).append(", enabled?=").append(this.enabled)
                .append(", defaultLeaseTime=").append(this.defaultLeaseTime).append(", maximumLeaseTime=")
                .append(this.maximumLeaseTime).append(", passDNS?=").append(this.passDns).append(']');
        return sb.toString();
    }
}
