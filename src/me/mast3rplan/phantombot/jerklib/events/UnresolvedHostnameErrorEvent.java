/* 
 * Copyright (C) 2015 www.phantombot.net
 *
 * Credits: mast3rplan, gmt2001, PhantomIndex, GloriousEggroll
 * gloriouseggroll@gmail.com, phantomindex@gmail.com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package me.mast3rplan.phantombot.jerklib.events;

import java.nio.channels.UnresolvedAddressException;
import me.mast3rplan.phantombot.jerklib.Session;

/**
 * Error generated when a DNS lookup fails during connection.
 *
 * @author mohadib
 */
public class UnresolvedHostnameErrorEvent extends ErrorEvent
{

    private String hostName;
    private UnresolvedAddressException exception;

    public UnresolvedHostnameErrorEvent(
            Session session,
            String rawEventData,
            String hostName,
            UnresolvedAddressException exception)
    {
        super(rawEventData, session, ErrorType.UNRESOLVED_HOSTNAME);
        this.hostName = hostName;
        this.exception = exception;
    }

    /**
     * Gets the wrapped UnresolvedAddressException
     *
     * @return UnresolvedAddressException
     */
    public UnresolvedAddressException getException()
    {
        return exception;
    }

    /**
     * Gets the unresolvable hostname
     *
     * @return hostname that could not be resloved
     */
    public String getHostName()
    {
        return hostName;
    }
}
